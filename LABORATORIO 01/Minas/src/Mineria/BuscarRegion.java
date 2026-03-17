package Mineria;

public class BuscarRegion {

    public static void buscarMejorRegion(Minas[][] matriz, int k){

        int filas = matriz.length;
        int columnas = matriz[0].length;
        //aqui utilizo length porque se usa para conocer el tamaño de un arreglo 

        double max = 0;
        int mejorFila = 0;
        int mejorCol = 0;

        for(int i = 0; i <= filas - k; i++){
        	//este for se va a mover las fila
            for(int j = 0; j <= columnas - k; j++){
            	//este igualmente las columnas 

                double valor = CalcularRegion.calcularRegion(matriz,i,j,k);
                  //aqui llamamos a lo de nuestra clase calcular region que la logica anterior asume cual es el mineral mayor
                if(valor > max){
                    max = valor;
                    mejorFila = i;
                    mejorCol = j;
                }
            }
        }

        System.out.println("Valor total maximo: " + max);
        System.out.println("Posicion inicial: (" + mejorFila + "," + mejorCol + ")");

        System.out.println("\nZonas de la region:");
        VizualizadorRegion.mostrarRegion(matriz,mejorFila,mejorCol,k);

        System.out.println("\nMineral predominante: " +
                AnalizadorMineral.mineralPredominante(matriz,mejorFila,mejorCol,k));
    }
}
