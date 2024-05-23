package ejercicio4;

import java.util.Scanner;

public class ejercicio38 {
		public static void main(String[] args) {
			Scanner datos = new Scanner(System.in);
			
			int clientes;
			int max=-9999;
			int min=9999;
			int hmin=0,hmax=0;
			
			
			 for (int i = 9;i <= 19; i=i+2) {
				 System.out.println("Ingrese cuantos clientes ingresaron en la hs "+i);
				 clientes=datos.nextInt();
				 
				 
				 if(clientes > max ) {
					 max = clientes;
					  hmax= i;
				 }
				 if (clientes < min ) {
					 min = clientes;
					  hmin=i;
				 }
					 
				 }
		
			 
			 
			 System.out.println("Cantidad max de clientes en el dia "+max);
			 System.out.println("Cantidad min de clientes en el dia "+min);
			 
			 
			 
		} 
		
				 

}
