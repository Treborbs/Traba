package ejercicio4;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
			
			int numcafe;
			
			System.out.println("Ingrese el numero de su cafe (1-5)");
			numcafe = datos.nextInt();
			
			switch (numcafe) {
			case 1:
				System.out.println("Cafe Cortado");
				break;
			case 2:
				System.out.println("Cafe Latte");
				break;
			case 3:
				System.out.println("Cafe Solo");
				break;
			case 4:
				System.out.println("Cafe Lagrima");
				break;
			case 5:
				System.out.println("Salio del programa");
				break;
			default:
				break;
			}
		
	}
}
