package EJERCICIO1;

public class Chocolatina {
    private String marca;

    public Chocolatina(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // equals compara por marca, necesario para search, delete y contar
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Chocolatina otra = (Chocolatina) obj;
        return this.marca.equals(otra.marca);
    }

    // toString necesario para que Cajoneria.toString() muestre datos utiles en el reporte
    @Override
    public String toString() {
        return "Chocolatina[marca=" + marca + "]";
    }
}