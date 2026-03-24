package eJERCIO8;

public class Utilidades {

    public static <T> void swap(T[] arreglo, int i, int j) {
        
        // Verificar índices válidos
        if (i < 0 || j < 0 || i >= arreglo.length || j >= arreglo.length) {
        	//verifica que los indices no sean negativos i ni j que el arreglo no puede pasarse del limite
        	//si alguna de estas se cumple  pasa el error 
            System.out.println("Índice fuera de rango");
            return;
        }

        // Intercambio
        T temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
        //guardas la variable temp en la posicion i
        // colocas en la posicion i el valor de j
        // en la posicion j coloca lo que guardastes en temp
    }
}