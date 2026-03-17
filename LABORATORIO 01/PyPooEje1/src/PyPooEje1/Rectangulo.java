package PyPooEje1;

import java.util.*;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        // añadi esto por si las dudas es una verificacion que hace que las esquinas no pueden estar en la misma línea vertical u horizontal
        if (c1.getX() == c2.getX() || c1.getY() == c2.getY()) {
            throw new IllegalArgumentException("las coordenadas ingresadas no forman un rectangulo valido (el area sería cero).");
        }

        // si es que logra pasar la verificacion osea todo bien continua
        if (c1.getX() <= c2.getX()) {
            setEsquina1(c1);
            setEsquina2(c2);
        } else {
            setEsquina1(c2);
            setEsquina2(c1);
        }
    }
    public void setEsquina1(Coordenada coo) {
        this.esquina1 = new Coordenada(coo);
    }

    public void setEsquina2(Coordenada coo) {
        this.esquina2 = new Coordenada(coo);
    }

    public Coordenada getEsquina1() {
        return this.esquina1;
    }

    public Coordenada getEsquina2() {
        return this.esquina2;
    }
    // agrego para calcular el area .
    public double calculoArea() {
        double ancho = Math.abs(esquina2.getX() - esquina1.getX());
        double alto  = Math.abs(esquina2.getY() - esquina1.getY());
        return ancho * alto;
    }

@Override
    public String toString() {
        return "(" + esquina1.toString() + ", " + esquina2.toString() + ")";
    }
}
