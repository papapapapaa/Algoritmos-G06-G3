package PyPooEje1;

public class ContainerRect {
	private Rectangulo[] rectangulos;
	private double[] distancias;
	private double[] areas;
	private int n;
	
	private static int numRec = 0;
	
	public ContainerRect(int n) {
		this.n = n;
		this.rectangulos = new Rectangulo[n];
		this.distancias = new double[n];
		this.areas = new double [n];
		
	}
	public void addRectangulo(Rectangulo r) {
		if (numRec < n) {
			rectangulos[numRec] = r;
			distancias[numRec] = r.getEsquina1().distancia(r.getEsquina2());
			areas[numRec] = r.calculoArea();
			numRec++;
		}
		else {
			System.out.println("Altoo, ya no se puede guardar el rectangulo");
			
		}
	}
	
	public String toString() {
	    String resultado = "Rectangulo    Coordenadas                Distancia    Area\n";
	    
	    for (int i = 0; i < numRec; i++) {
	        double dist = Math.round(distancias[i] * 100.0) / 100.0;
	        double ar   = Math.round(areas[i] * 100.0) / 100.0;

	        resultado = resultado + "    " + (i + 1) + "         " + rectangulos[i].toString() + "     " + dist + "         " + ar + "\n";
	    }
	    
	    return resultado;
	}
}
