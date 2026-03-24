package EJERCICIO1;

public class TestGen {

    // metodo exist del ejercicio 1
    public static <T> boolean exist(T[] arreglo, T elemento) {
        for (T item : arreglo) {
            if (item.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // pruebas con String e Integer
        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};

        System.out.println(exist(v, "Sanchez"));
        System.out.println(exist(w, 34));
        System.out.println(exist(v, 12));

        // prueba con chocolatina
        Chocolatina[] chocos = {
                new Chocolatina("casino"),
                new Chocolatina("galleta")
        };
        System.out.println(exist(chocos, new Chocolatina("casino")));
        System.out.println(exist(chocos, new Chocolatina("galleta")));
        System.out.println(exist(chocos, new Chocolatina("mostaza")));

        // prueba con golosina
        Golosina[] golos = {
                new Golosina("osito de gomita", 0.9),
                new Golosina("caramelo", 0.4)
        };
        System.out.println(exist(golos, new Golosina("caramelo", 0.4)));
        System.out.println(exist(golos, new Golosina("osito de gomita", 0.9)));
        System.out.println(exist(golos, new Golosina("caramelo", 0.7)));


        // ejercicio 5: probando la cajoneria con golosinas

        Cajoneria<Golosina> cajoneria = new Cajoneria<>(10);

        // agregamos 5 golosinas, el cuarto es igual al primero para probar contar()
        cajoneria.add("Rojo",     new Golosina("osito de gomita", 0.9));
        cajoneria.add("Amarillo", new Golosina("caramelo", 0.4));
        cajoneria.add("Verde",    new Golosina("chicle", 0.2));
        cajoneria.add("Azul",     new Golosina("osito de gomita", 0.9));
        cajoneria.add("Blanco",   new Golosina("paleta", 1.1));

        // vemos como queda la cajoneria
        System.out.println("\n=== cajoneria de golosinas ===");
        System.out.println(cajoneria.toString());

        // buscamos por nombre y peso, que es lo que compara el equals de Golosina
        System.out.println("=== search ===");
        System.out.println(cajoneria.search(new Golosina("caramelo", 0.4)));   // lo encuentra
        System.out.println(cajoneria.search(new Golosina("caramelo", 0.9)));   // mismo nombre pero peso diferente, no lo encuentra
        System.out.println(cajoneria.search(new Golosina("turron", 5.0)));     // no existe

        // delete: si lo encuentra lo elimina y lo retorna, si no retorna null
        System.out.println("\n=== delete ===");
        Golosina eliminada = cajoneria.delete(new Golosina("chicle", 0.2));
        System.out.println("eliminado: " + eliminada);
        System.out.println("esto no existe, deberia salir null: " + cajoneria.delete(new Golosina("fantasma", 0.0)));

        // vemos como queda despues del delete
        System.out.println("\n=== cajoneria despues del delete ===");
        System.out.println(cajoneria.toString());

        // ejercicio 6: contar cuantas veces aparece un elemento
        System.out.println("=== contar ===");
        // osito de gomita se agrego dos veces arriba
        System.out.println("osito de gomita 0.9 aparece: " + cajoneria.contar(new Golosina("osito de gomita", 0.9)) + " vez/veces");
        System.out.println("caramelo 0.4 aparece: " + cajoneria.contar(new Golosina("caramelo", 0.4)) + " vez/veces");
        System.out.println("turron no esta, deberia dar 0: " + cajoneria.contar(new Golosina("turron", 5.0)));

        // ejercicio 7: mismo proceso pero con chocolatinas, no hay que cambiar Cajoneria
        Cajoneria<Chocolatina> cajoneriaChoco = new Cajoneria<>(10);

        cajoneriaChoco.add("Rojo",     new Chocolatina("milka"));
        cajoneriaChoco.add("Amarillo", new Chocolatina("ferrero"));
        cajoneriaChoco.add("Verde",    new Chocolatina("milka"));  // repetimos milka para probar contar
        cajoneriaChoco.add("Azul",     new Chocolatina("snickers"));
        cajoneriaChoco.add("Morado",   new Chocolatina("twix"));

        System.out.println("\n=== cajoneria de chocolatinas ===");
        System.out.println(cajoneriaChoco.toString());

        System.out.println("=== search ===");
        System.out.println(cajoneriaChoco.search(new Chocolatina("ferrero")));
        System.out.println(cajoneriaChoco.search(new Chocolatina("kitkat")));

        System.out.println("\n=== delete ===");
        System.out.println("eliminado: " + cajoneriaChoco.delete(new Chocolatina("snickers")));

        System.out.println("\n=== contar ===");
        System.out.println("milka aparece: " + cajoneriaChoco.contar(new Chocolatina("milka")) + " vez/veces");
        System.out.println("kitkat no esta, deberia dar 0: " + cajoneriaChoco.contar(new Chocolatina("kitkat")));

        System.out.println("\n=== cajoneria de chocolatinas final ===");
        System.out.println(cajoneriaChoco.toString());
    }
}