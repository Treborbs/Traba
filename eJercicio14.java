package ejercicio4;

import java.util.Scanner;

public class eJercicio14 {

	public static void main(String[]args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese un numero ");
		num = datos.nextInt() ;
		
		if (num!=0) {
			System.out.println("Se puede realizar la division");
			System.out.println("Ingrese otro numero para dividir ");
			int num2 = datos.nextInt();	
			int r1 = num/num2;
			System.out.println("La division de su numero es "+r1);
		}
		else {
			System.out.println("Su numero no se puede dividir");
		}
	}
}
