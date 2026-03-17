package PyPooEje1;

import java.util.Scanner;

public class PyPooEje1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3; 
        ContainerRect contenedor = new ContainerRect(n);

        String opcion = "s";
        int i = 1;

        while (opcion.equalsIgnoreCase("s")) {
            System.out.println("--- Intento de ingreso Rectangulo " + i + " ---");
            System.out.print("Ingrese una esquina (x y): ");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            System.out.print("Ingrese esquina opuesta (x y): ");
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            if ((x1 == x2) || (y1 == y2)) {
                System.out.println("no puedes ingresar las mismas coordenadas en X o Y");
                System.out.println("Este rectangulo no se guardara");
            } else {
                Rectangulo r = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
                contenedor.addRectangulo(r);
                i++;
            }

            System.out.print("Si deseas agregar otro, escribe s, sino, cualquier caracter: ");
            opcion = sc.next();
        }

        System.out.println("\n--- LISTADO DE RECTANGULOS ALMACENADOS ---");
        System.out.println(contenedor.toString());

        sc.close();
    }
}