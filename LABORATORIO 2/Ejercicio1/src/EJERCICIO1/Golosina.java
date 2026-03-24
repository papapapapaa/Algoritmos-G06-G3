package EJERCICIO1;

public class Golosina {
    private String nombre;
    private double peso;

    public Golosina(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // equals compara por nombre Y peso, necesario para search, delete y contar
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Golosina golosina = (Golosina) obj;
        // Double.compare devuelve 0 si son iguales, evita problemas de precision con ==
        return Double.compare(golosina.peso, peso) == 0 && nombre.equals(golosina.nombre);
    }

    // toString necesario para que Cajoneria.toString() muestre datos utiles en el reporte
    @Override
    public String toString() {
        return "Golosina[nombre=" + nombre + ", peso=" + peso + "g]";
    }
}