package ejercicio4;

import java.util.Scanner;

public class ejercicio36 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		 double salarioporhora=10;
		 double min = 999;
		 double max =-999;
		 int total=0;
		 double ingresos;

		 
		 for (int i = 8;i <= 17; i++) {
			 
			 System.out.println("Ingresos en la Hora "+i);
			 ingresos=datos.nextInt();
			 
			 total+=ingresos;
			 if(ingresos > max ) {
				 
				 max = i;
			 }
			 if (ingresos < min ) {
				 min= i;
			 }
			 
			 
		 }
		 
		 System.out.println("Ingreso total "+total);
			 System.out.println("Tuvo Mayor ingresos en la hora "+hmax);
			 System.out.println("Tuvo Menor ingresos en la hora "+hmin);
			 
	
	
			
	
	
	
	
	
	}
}
