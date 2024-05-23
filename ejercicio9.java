package ejercicio4;

import java.util.Scanner;

public class ejercicio9 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String Nombre; 
		String Apellido;
		Float numero;
		
		System.out.println("Introducir su nombre: " );
		Nombre = datos.next();
		
		System.out.println("Introducir su Apellido: " );
		Apellido = datos.next();
		int numeroAleatorio = (int) (Math.random()*99);
		
		
		System.out.println("Su nombre es : "+ Nombre);
		
		System.out.println("Su Apellido es : "+ Apellido);
		
		
		System.out.println("Numero del bingo entre (0-99): "+ numeroAleatorio);
		
		
		
		
	}

}