package EJERCICIO1;
public class MetodoExist {
    public static <T> boolean exist(T[] arreglo, T elemento) {
    	//creamos un metodo generico que con boolean va a devolver true o false
        for (int i = 0; i < arreglo.length; i++) {
        	//aqui inicia el bucle en 0 y va a recorrer hasta el final
            if (arreglo[i].equals(elemento)) {
            	//comparar el elemento actual con el que vamos a buscar 
                return true;
            }
        }
        return false;
    }
}