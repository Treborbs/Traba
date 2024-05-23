package ejercicio4;

import java.util.Scanner;
public class oscar_tapia {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int años;
		int semanas;
		int meses;
		
		System.out.println("Ingrese Los años: ");
		años = datos.nextInt();
		System.out.println("Ingrese Los Meses: ");
		meses = datos.nextInt();
		System.out.println("Ingrese las semanas: ");
		semanas = datos.nextInt();
		
		float r1 = años * 365;
		float r2 = meses * 31; 
		float r3 = semanas * 7;
		
		System.out.println("Los años en dias son "+ r1);
		System.out.println("Los meses en dias son "+ r2);
		System.out.println("Las semanas en dias son "+r3);
		
		
	}
	
	
	
	
	

}
