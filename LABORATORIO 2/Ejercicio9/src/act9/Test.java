package act9;


public class Test {

	public static void main(String[] args) {
		// Solo permite clases que implementen Cargable
		 PowerStation<Smartphone> zonaCelulares = new PowerStation<>();

		 Smartphone s1 = new Smartphone("iPhone 15", 20.5);
		 Smartphone s2 = new Smartphone("Galaxy S24", 25.0);
		 
		 
		 

		 zonaCelulares.conectar(s1);
		 zonaCelulares.conectar(s2);

		 System.out.println("Consumo Total: " + zonaCelulares.calcularConsumoTotal() + "W");
		
		 
		 zonaCelulares.buscarDispositivo(s2);
		 
		 zonaCelulares.mostrarReporte();
		 
		 if (s1.equals(s2)) {
	            System.out.println("Son el mismo modelo de telefono.");
	        }else {System.out.println("no son lo mismos");}
	}

}
