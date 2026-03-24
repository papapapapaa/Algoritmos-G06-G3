package act9;

import java.util.Objects;

public class Laptop implements Cargable{
	private String marca;
	private double consumoVatios;
	private int bateriaActual;
	

	
	
	public Laptop(String marca, double consumoVatios) {
		super();
		this.marca = marca;
		this.consumoVatios = consumoVatios;
		this.bateriaActual = 0;
	}

	


	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public int getBateriaActual() {
		return bateriaActual;
	}




	public void setBateriaActual(int bateriaActual) {
		this.bateriaActual = bateriaActual;
	}




	public void setConsumoVatios(double consumoVatios) {
		this.consumoVatios = consumoVatios;
	}




	@Override
	public double getConsumoVatios() {
		return this.consumoVatios;
	}

	@Override
	public int getNivelBateria() {
		return this.bateriaActual;
	}

	@Override
	public void cargar(int cantidad) {
		this.bateriaActual += cantidad;
		System.out.println(marca + " bateria => " + bateriaActual);
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(marca, other.marca);
	}	
	
	

}
