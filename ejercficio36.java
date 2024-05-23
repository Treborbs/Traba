package ejercicio4;

import java.util.Scanner;

public class ejercficio36 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		 int min = 999;
		 int max =-999;
		 int total=0;
		 int ingresos;
		 int hmax=0;
		 int hmin=0;
		 
		 for (int i = 8;i <= 17; i++) {
			 
			 System.out.println("Ingresos en la Hora "+i);
			 ingresos=datos.nextInt();
			 
			 total+=ingresos;
			 if(ingresos > max ) {
				 max = ingresos;
				 hmax= i;
			 }
			 if (ingresos < min ) {
				 min= ingresos;
				 hmin=i;
			 }
			 
			 
		 }
		 
		 System.out.println("Ingreso total "+total);
			 System.out.println("Tuvo Mayor ingresos en la hora "+hmax);
			 System.out.println("Tuvo Menor ingresos en la hora "+hmin);
			 
	
	
			
	
	
	
	
	
	}
}
