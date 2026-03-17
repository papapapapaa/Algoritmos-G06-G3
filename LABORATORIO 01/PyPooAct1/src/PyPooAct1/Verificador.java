package PyPooAct1;

public class Verificador {

    //limites minimo y maximo tanto de x y y
    private static double[] limites(Rectangulo r) {
        double x1 = r.getEsquina1().getX();
        double x2 = r.getEsquina2().getX();

        double y1 = r.getEsquina1().getY();
        double y2 = r.getEsquina2().getY();

        return new double[]{
                Math.min(x1, x2), Math.max(x1, x2),
                Math.min(y1, y2), Math.max(y1, y2)
        };
    }

    // aca es cuando se sobreponen
    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
        double[] a = limites(r1);
        double[] b = limites(r2);

        double interseccionX = Math.min(a[1], b[1]) - Math.max(a[0], b[0]);
        double interseccionY = Math.min(a[3], b[3]) - Math.max(a[2], b[2]);

        return interseccionX > 0 && interseccionY > 0;
    }

    // aca cuando tocan un borde pero no se sobrepnen
    public static boolean esJunto(Rectangulo r1, Rectangulo r2) {
        double[] a = limites(r1);
        double[] b = limites(r2);

        double interseccionX = Math.min(a[1], b[1]) - Math.max(a[0], b[0]);
        double interseccionY = Math.min(a[3], b[3]) - Math.max(a[2], b[2]);

        return interseccionX >= 0 && interseccionY >= 0 && !(interseccionX > 0 && interseccionY > 0);
    }

    // y aca cuando no se tocan ni nada
    public static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {
        double[] a = limites(r1);
        double[] b = limites(r2);

        double interseccionX = Math.min(a[1], b[1]) - Math.max(a[0], b[0]);
        double interseccionY = Math.min(a[3], b[3]) - Math.max(a[2], b[2]);

        return interseccionX < 0 || interseccionY < 0;
    }

}