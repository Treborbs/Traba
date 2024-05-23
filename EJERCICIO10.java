package ejercicio4;

import java.util.Scanner;

public class EJERCICIO10 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String Nombre; 
		String Apellido;
		int numero1;
		
		System.out.println("Introducir su nombre: " );
		Nombre = datos.next();
		
		System.out.println("Introducir su Apellido: " );
		Apellido = datos.next();
		
		System.out.println("Ingrese un numero entre (0-99)");
		numero1 = datos.nextInt();
		
		int numeroAleatorio = (int) (Math.random()*99);
		
		
		System.out.println("Su nombre es : "+ Nombre);
		
		System.out.println("Su Apellido es : "+ Apellido);
		
		if (numero1 == numeroAleatorio) {
			
			System.out.println("Ganaste el Brawl Pass ");
			
		}
		
		else if (numero1 != numeroAleatorio) {
			System.out.println("Perdiste, el numero ganador era el "+ numeroAleatorio);
		}
		
		
		
	}

}