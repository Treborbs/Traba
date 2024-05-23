package ejercicio4;

import java.util.Scanner;

public class EJERCICIO6 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		float alumno;
		double redondeo;
	    
	     System.out.println("Ingrese su nota (1-10): ");
	     alumno = datos.nextFloat();
	        	 
	     redondeo= Math.round(alumno);

	    System.out.println("El redondeo de su nota es "+ redondeo);
	    		 
	    		 
	}

}
