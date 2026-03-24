package act9;
import java.util.ArrayList;

public class PowerStation <T extends Cargable >  {
	private ArrayList<T> almacenadorDipoitivos = new ArrayList<>();
	
	
	public void conectar(T dispositivos) {
		almacenadorDipoitivos.add(dispositivos);
	}
	
	public double calcularConsumoTotal() {
		double sConsumo = 0 ;
		for(int i = 0; i < almacenadorDipoitivos.size(); i++ ) {
			T actual = almacenadorDipoitivos.get(i);
			sConsumo += actual.getConsumoVatios() ;
		}
		return sConsumo;
	}
	

	public int buscarDispositivo(T prototipo) {
		System.out.println("POSICION");
		
		for(int i = 0; i < almacenadorDipoitivos.size();i++ ) {
			T actual = almacenadorDipoitivos.get(i);
			
			if (actual.equals(prototipo)) {
				System.out.println("   "+i);
				return i ; //si son iguales devuelve la posicion en donde se encuentra
			}
		}
		return -1;
		
	}
	
	public void mostrarReporte() {

		
			System.out.println("POSICION\tVatios");
		for(int i = 0; i < almacenadorDipoitivos.size() ; i++) {
			T actual = almacenadorDipoitivos.get(i);
			
			System.out.println("   "+i+"\t\t"+ actual.getConsumoVatios()+ " W");
			
		}
	}
	
	
	
}
