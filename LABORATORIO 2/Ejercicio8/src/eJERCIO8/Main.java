package eJERCIO8;
public class Main {

    public static void main(String[] args) {

        // caso 1
        String[] letras = {"A", "B", "C", "D"};
        
        System.out.println("Antes");
        for (String s : letras) {
            System.out.print(s + " ");
        }

        Utilidades.swap(letras, 1, 3);

        System.out.println("\nDespués");
        for (String s : letras) {
            System.out.print(s + " ");
        }

        System.out.println("\n");

        //caso 2
        Integer[] numeros = {10, 20, 30, 40};
        
        System.out.println("Antes");
        for (Integer n : numeros) {
            System.out.print(n + " ");
        }

        Utilidades.swap(numeros, 0, 2);

        System.out.println("\nDespués");
        for (Integer n : numeros) {
            System.out.print(n + " ");
        }
    }
}