package act9;

import java.util.Objects;

public class Smartphone implements Cargable{
	private String modeloSmart;
	private double consumoVatios;
	private int nivelBateria;
	
	
	
	public Smartphone(String modelo , double cvatois) {
		super();
		this.modeloSmart = modelo;
		this.consumoVatios = cvatois ;
		this.nivelBateria = 0;
	}


	

	public String getModeloSmart() {
		return modeloSmart;
	}




	public void setModeloSmart(String modeloSmart) {
		this.modeloSmart = modeloSmart;
	}




	public void setConsumoVatios(double consumoVatios) {
		this.consumoVatios = consumoVatios;
	}




	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}




	@Override
	public double getConsumoVatios() {
		return consumoVatios;
	}
	@Override
	public void cargar(int cantidad) {
		this.nivelBateria += cantidad;
		System.out.println(modeloSmart + " bateria => " + nivelBateria);
	}
	@Override
	public int getNivelBateria() {
		return this.nivelBateria;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Smartphone other = (Smartphone) obj;
		return Objects.equals(modeloSmart, other.modeloSmart);
	}



	
}
