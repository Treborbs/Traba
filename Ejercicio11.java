package ejercicio4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
	
	Scanner datos = new Scanner(System.in);
	
	int numero; 
	
	System.out.println("Ingrese un numero: ");
	numero = datos.nextInt();
	
	if (numero<0) {
       System.out.println("su numero es negativo");  
	}
  
	else if (numero > 0) {
		System.out.println("Su numero es positivo");
	}
	else if (numero == 0) {
		System.out.println("Su numero es intermedio");
	}
	
	
	
	
	
	}
	
	
	
}
