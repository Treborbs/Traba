package ejercicio4;

import java.util.Scanner;

public class ejercicio22 {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner datos =  new Scanner(System.in);
		
		int numero1;
		int intentos=0;
		int numeroAleatorio = (int) (Math.random()*99);
		System.out.println("Ingrese un numero entre (0-99)");
			numero1 = datos.nextInt();
		while(numeroAleatorio!=numero1) {
			System.err.println("Fallaste Intentelo de nuevo (0-99)");
			numero1 = datos.nextInt();
			intentos++;
			Thread.sleep(20);
		}	
		System.out.println("Tuvo "+intentos+" Intentos");
		System.out.println("GG, Ganaste");
	}
}
