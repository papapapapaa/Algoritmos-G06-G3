package Mineria;

public class Minas {
	private String mineral;
	private double cantidad;
	private double pureza;
	
public Minas(String mineral, double cantidad,double pureza){
   this.mineral=mineral;
   this.cantidad= cantidad;
   this.pureza=pureza;
}
 public double getvalor_economico()
 {
	 return this.cantidad* this.pureza;
 }
  public String getmineral() {
	  return mineral;
  }
  @Override 
  public String toString() {
	  return "{" + mineral+ ";cantidad;" + cantidad + ", pureza :"+ pureza  +"}";
  }
}
