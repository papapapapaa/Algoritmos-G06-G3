package Mineria;

public class VizualizadorRegion {

    public static void mostrarRegion(Minas[][] matriz, int fila, int columna, int k){

      //esta es la clase mas sencilla solo creamos 2 bucle for y imprime todas las matrices columa y fila

        for(int i = fila; i < fila + k; i++){

            for(int j = columna; j < columna + k; j++){

                System.out.println(matriz[i][j]);

            }
        }
    }
}