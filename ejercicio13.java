package ejercicio4;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		char caracter;
				
		System.out.println("Ingrese caracterer entre S-M-L");
		
		caracter = datos.next().charAt(0);
		
		if(caracter == 's'|| caracter =='S') {
			System.out.println("Todavia quedan 5 remeras");
		}
		if (caracter == 'm' || caracter == 'M') {
			System.out.println("Todavia quedan 2 remeras ");
		}
		if (caracter == 'l' || caracter == 'L') {
			System.out.println("No quedan remeras");
		}
	}
}
