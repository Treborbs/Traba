package ejercicio4;

import java.util.Scanner;

public class ejercicio24 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos =  new Scanner(System.in);
		boolean continuar = true;
		int numero1;
		int numero;
			System.out.println("Ingrese un numero ");
			numero1 = datos.nextInt();
			System.out.println("Ingrese otro numero ");
			numero = datos.nextInt();
			int resultado= numero + numero1;
			System.out.println("La suma de sus dos numeros es "+resultado);
			System.out.println("Ingrese 0 para salir del programa");
			int cero = datos.nextInt();
			
			if (cero== 0) {
			System.out.println("Ha salido del programa");
		}
		else {
			while(continuar) {
				System.out.println("Ingrese un numero ");
				numero1 = datos.nextInt();
				System.out.println("Ingrese otro numero ");
				numero = datos.nextInt();
				 resultado= numero + numero1;
				System.out.println("La suma de sus dos numeros es "+resultado);
				System.out.println("Ingrese 0 para salir del programa");
				 cero = datos.nextInt();
				
				
				
			if (cero==0) {
				System.out.println("Ha salido del programa");
				continuar = false;
			}
			
			}
			
			Thread.sleep(20);
		}	
	}
}
