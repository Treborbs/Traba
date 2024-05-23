package ejercicio4;

import java.util.Scanner;

public class ejercicio33 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		String nombre = "";
		int edad;
		String edade= ""; 
		
		for (int i = 1;i <= 11; i++) {	
		
		System.out.println("Ingrese el nombre del jugador: ");
		nombre +=datos.nextLine()+ "\n";
		System.out.println("Ingrese la edad del jugador: ");
		edad = datos.nextInt();
		datos.nextLine(); 
        edade += edad + "\n";
		
		}

		System.out.println("La Lista De Jugadores son:");
		System.out.println(nombre);
		System.out.println("Las edad de los jugadores son:");
		System.out.println(edade);
		
	}

}
