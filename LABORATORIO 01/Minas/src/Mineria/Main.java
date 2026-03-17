package Mineria;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //el try opte por usarlo porque estoy trabajndo con archivos y es una buena practica utilizarlo para asi evitar errores 
        try{

            Scanner sc = new Scanner(System.in);
            //archivo que contiene los datos del terreno
            File archivo = new File("src/Mineria/terreno.txt");
            //creamos el analizador
            AnalizadorMinero analizador = new AnalizadorMinero();
            //cargamos el archivo
            analizador.Archivo(archivo);
            //obtenemos la matriz
            Minas[][] matriz = analizador.getMatriz();
            //pedimos al usuario el tamaño de la region
            System.out.print("Ingrese el tamaño de la region (k): ");
            int k = sc.nextInt();
            //buscamos la mejor region
            BuscarRegion.buscarMejorRegion(matriz, k);

            sc.close();
        }

        catch(Exception e){
            System.out.println("Error al leer el archivo");
        }

    }
}