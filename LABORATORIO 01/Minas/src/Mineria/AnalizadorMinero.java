package Mineria;
import java.util.*;
import java.io.*;
public class AnalizadorMinero {
	//toda esta clase que cree se encarga de analizar todo el terreno minero
 private Minas[] [] matriz; 
 private int filas;
 private int columnas;
 //cree  una matriz que almacena las referencias de los objetos
 
 public void Archivo (File archivo ) throws FileNotFoundException{
	 Scanner sc=new Scanner(archivo);
	 this.filas=sc.nextInt();
	 this.columnas=sc.nextInt();
//en esta parte del codigo tuve que repasar la parte de manejo de archivos en java para refrescar memoria de lo hecho en el anterior semestre 
//cree la matriz definiendo los objetos , filas y columnas  
 this.matriz=new Minas[filas][columnas];
 //aqui creo yo los contadores que i se va a encargar de moverse de las filas y las columnas va a ser j opte por un bucle for porque se cuantas vueltas van a ser en vez de un bucle while o while true
 for (int i=0 ; i< filas; i++) {
 for (int j=0; j<columnas;j++ ) {
	  String mineral = sc.next();
      double cantidad = sc.nextDouble();
      double pureza = sc.nextDouble();
      matriz[i][j] = new Minas(mineral, cantidad, pureza);
      
 }

 }
   sc.close();
 }
 public Minas[][] getMatriz(){
     return matriz;
}
}
	


