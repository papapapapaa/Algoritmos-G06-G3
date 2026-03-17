package Mineria;

public class CalcularRegion{

public static double calcularRegion(Minas[][] matriz, int fila, int columna, int k){

    //cree esta clase para calcular la region proporcionada y agregue la variable k que seria el tamaño que debemos revisar por ejemplo si seria un 2 x 2 o un 3 x 3 o etc

    double suma = 0;
    //aqui guardo la suma de mi codigo 

    for(int i = fila; i < fila + k; i++){
        //igual que en el anterior este recorre las filas 

        for(int j = columna; j < columna + k; j++) {
            //igual que el anterior recorre las columnas 

            suma += matriz[i][j].getvalor_economico();
            //esto va a sumar todos el valor economico de cada uno basandose en los valor economico que anteriormente lo coloque que es multiplicar la cantidad por pureza y va a ir sumando las casillas de las matrices 

        }     
    } 

    return suma;
}
}