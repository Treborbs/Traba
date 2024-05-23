package ejercicio4;

import java.util.Scanner;

public class ejercicio39 {
public static void main(String[] args) {
	Scanner datos = new Scanner(System.in);
	
	String[] nombre= new String[12];
	int[]edad = new int[12];
	
	
	for (int i = 1;i <= 11; i++) {
		System.out.println("Ingrese el nombre del jugador "+i);
		nombre[i]=datos.next();
		System.out.println("Ingrese la edad del jugador "+i);
		edad[i]=datos.nextInt();
		
	}

		System.out.println("El nombre del jugador 1 es "+nombre[1]);
		System.out.println("La edad del jugador es "+edad[1]);

		System.out.println("El nombre del jugador 2 es "+nombre[2]);
		System.out.println("La edad del jugador es "+edad[2]);

		System.out.println("El nombre del jugador 3 es "+nombre[3]);
		System.out.println("La edad del jugador es "+edad[3]);

		System.out.println("El nombre del jugador 4 es "+nombre[4]);
		System.out.println("La edad del jugador es "+edad[4]);

		
		System.out.println("El nombre del jugador 5 es "+nombre[5]);
		System.out.println("La edad del jugador es "+edad[5]);

		System.out.println("El nombre del jugador 6 es "+nombre[6]);
		System.out.println("La edad del jugador es "+edad[6]);

		System.out.println("El nombre del jugador 7 es "+nombre[7]);
		System.out.println("La edad del jugador es "+edad[7]);

		System.out.println("El nombre del jugador 8 es "+nombre[8]);
		System.out.println("La edad del jugador es "+edad[8]);

		System.out.println("El nombre del jugador 9 es "+nombre[9]);
		System.out.println("La edad del jugador es "+edad[9]);

		System.out.println("El nombre del jugador 10 es "+nombre[10]);
		System.out.println("La edad del jugador es "+edad[10]);

		System.out.println("El nombre del jugador 11 es "+nombre[11]);
		System.out.println("La edad del jugador es "+edad[11]);








}
}
