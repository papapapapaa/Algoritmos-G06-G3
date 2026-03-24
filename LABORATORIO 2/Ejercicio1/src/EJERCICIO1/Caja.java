package EJERCICIO1;

// para lo  unico q sirve esta clase es almacenar un objeto generico y su color
public class Caja<T> {

    // atributos basicos de la caja
    private String color;
    private T objeto; // la T indica que puede guardar cualquier tipo de dato

    // constructor para inicializar la caja con su color y el contenido
    public Caja(String color, T objeto) {
        this.color = color;
        this.objeto = objeto;
    }

    // metodos getter para obtener los valores
    public String getColor() {
        return color;
    }

    public T getObjeto() {
        return objeto;
    }

    // metodos setter para modificar los valores si fuera necesario
    public void setColor(String color) {
        this.color = color;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
}