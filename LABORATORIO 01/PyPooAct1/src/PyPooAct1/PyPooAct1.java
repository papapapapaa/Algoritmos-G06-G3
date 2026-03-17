package PyPooAct1;

import java.util.Scanner;

public class PyPooAct1 {

    public static void mostrarRectangulo(String etiqueta, Rectangulo r) {
        System.out.println(etiqueta + "=" + r.toString());
    }

    public static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2) {
        double x1 = Math.max(
                Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX()),
                Math.min(r2.getEsquina1().getX(), r2.getEsquina2().getX())
        );
        double x2 = Math.min(
                Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX()),
                Math.max(r2.getEsquina1().getX(), r2.getEsquina2().getX())
        );
        double y1 = Math.max(
                Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY()),
                Math.min(r2.getEsquina1().getY(), r2.getEsquina2().getY())
        );
        double y2 = Math.min(
                Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY()),
                Math.max(r2.getEsquina1().getY(), r2.getEsquina2().getY())
        );
        return new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese una esquina del 1er rectangulo: ");
        double ax1 = sc.nextDouble(), ay1 = sc.nextDouble();
        System.out.println("ingrese la esquina opuesta del 1er rectangulo: ");
        double ax2 = sc.nextDouble(), ay2 = sc.nextDouble();

        System.out.println("ingrese una esquina del 2do rectangulo: ");
        double bx1 = sc.nextDouble(), by1 = sc.nextDouble();
        System.out.println("ingrese la esquina opuesta del 2do rectangulo: ");
        double bx2 = sc.nextDouble(), by2 = sc.nextDouble();

        Rectangulo rectA = new Rectangulo(new Coordenada(ax1, ay1), new Coordenada(ax2, ay2));
        Rectangulo rectB = new Rectangulo(new Coordenada(bx1, by1), new Coordenada(bx2, by2));

        System.out.println("{");

        mostrarRectangulo("rectangulo A", rectA);
        mostrarRectangulo("rectangulo B", rectB);

        if (Verificador.esSobrePos(rectA, rectB)) {
            System.out.println("rectangulos A y B se sobreponen.");
            Rectangulo sobre = rectanguloSobre(rectA, rectB);

            System.out.printf("area de sobreposicion = %.2f\n", sobre.calculoArea());

        } else if (Verificador.esJunto(rectA, rectB)) {
            System.out.println("rectangulos A y B se juntan");

        } else {
            System.out.println("rectangulos A y B son disjuntos");
        }

        System.out.println("}");

        sc.close();
    }
}