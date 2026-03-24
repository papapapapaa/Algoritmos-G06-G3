package EJERCICIO1;

import java.util.ArrayList;
import java.util.Iterator;

// la unica responsabilidad de esta clase es gestionar la coleccion de cajas
public class Cajoneria<T> implements Iterable<Caja<T>> {

    // arrayList que guarda nuestras cajas de tipo Caja<T>
    private ArrayList<Caja<T>> lista = new ArrayList<>();
    // limite maximo de cajas que podemos guardar
    private int tope;

    // constructor que recibe el limite al crear la cajoneria
    public Cajoneria(int tope) {
        this.tope = tope;
    }

    // agrega una nueva caja con su color y objeto a la cajoneria
    public void add(String color, T objeto) {
        if (lista.size() < tope) {
            lista.add(new Caja<>(color, objeto));
        } else {
            throw new RuntimeException("no caben mas cajas en la cajoneria");
        }
    }

    @Override
    public Iterator<Caja<T>> iterator() {
        return lista.iterator();
    }

    // busca un elemento y retorna su posicion y color de caja, o mensaje si no existe
    public String search(T elemento) {
        for (int i = 0; i < lista.size(); i++) {
            Caja<T> cajaActual = lista.get(i);
            if (cajaActual.getObjeto().equals(elemento)) {
                return "Posicion: " + (i + 1) + ", Color: " + cajaActual.getColor();
            }
        }
        return "Elemento no encontrado";
    }

    // elimina y retorna el objeto si existe, null si no se encuentra
    public T delete(T elemento) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getObjeto().equals(elemento)) {
                T objetoEliminado = lista.get(i).getObjeto();
                lista.remove(i);
                return objetoEliminado;
            }
        }
        return null;
    }

    // EJERCICIO 6: cuenta cuantas veces aparece un elemento en toda la cajoneria
    // recorre todas las cajas y usa equals para comparar, igual que search y delete
    public int contar(T elemento) {
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            // equals es el mismo que ya definimos en Golosina y Chocolatina
            if (lista.get(i).getObjeto().equals(elemento)) {
                contador++;
            }
        }
        return contador;
    }

    // reporte con formato de tabla: Posicion | Color Caja | Objeto
    @Override
    public String toString() {
        StringBuilder reporte = new StringBuilder();

        // encabezado con columnas alineadas
        reporte.append(String.format("%-10s | %-15s | %s\n", "Posicion", "Color Caja", "Objeto"));
        reporte.append("--------------------------------------------------\n");

        // fila por cada caja en la lista
        for (int i = 0; i < lista.size(); i++) {
            Caja<T> caja = lista.get(i);
            // toString() del objeto usa el que definimos en Golosina/Chocolatina
            reporte.append(String.format("%-10d | %-15s | %s\n",
                    (i + 1), caja.getColor(), caja.getObjeto().toString()));
        }

        return reporte.toString();
    }
}