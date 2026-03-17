package Mineria;
import java.util.HashMap;

public class AnalizadorMineral {

    // sirve para encontrar cual es el mineral que más se repite
    public static String mineralPredominante(Minas[][] matriz, int fila, int columna, int k){
        //en esta parte del codigo se me complico un poco porque se hacia muy largo el codigo asi que investigue  y opte por usar hash map
        HashMap<String,Integer> contador = new HashMap<>();
        // crea algo asi como un diccionario con clave y valor el string va a ser por el nombre del material y el integer por el numero que aparece 

        for(int i = fila; i < fila + k; i++){
            //igualmente creo un bucle for para reccorrer las filas 
            for(int j = columna; j < columna + k; j++){
                //igualmente con columnas

                String m = matriz[i][j].getmineral();
                //devuelve el material de la matriz 
                //tuve que insvestigar esta parte 

                if(contador.containsKey(m)){
                    //.constainkey es un metodo del hashmap para verificar si ya existe el valor o dato 
                    contador.put(m, contador.get(m)+1);
                    //si en caso existe aumenta +1
                }else{
                    contador.put(m,1);
                }
            }
        }

        String predominante = "";
        int max = 0;

        for(String m : contador.keySet()){
            //este bucle es un tipo for-each
            //el keyset es otro metodo del hashmap que devuelve todas las claves osea en este caso seria los string

            if(contador.get(m) > max){
                max = contador.get(m);
                predominante = m;
                //esto ayuda de acuerdo al anterior como en el anterior verificamos si se le suma +1 en este caso va a verificar con la variable creada max si es que cambia o no cambia
            }
        }

        return predominante;
    }
}