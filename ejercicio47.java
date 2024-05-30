package ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio47 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int[] cantidadNotas = new int [5]; 
		

	int length = cantidadNotas.length;
	
		String apellido;
		
			System.out.println("Ingrese el apellido del alumno");
			apellido=datos.next();
	
		
		for (int i = 0;i < cantidadNotas.length; i++) {
			System.out.println("Ingrese la nota "+i+" del alumno: ");
			cantidadNotas[i]=datos.nextInt();
			
		}
		for (int mostrarNotas:cantidadNotas) {
			System.out.println("Las (desordenado)notas son "+mostrarNotas);
			}
			
			System.out.println("Del alumno "+apellido);
		
		Arrays.sort(cantidadNotas);
		for (int mostrarNotas:cantidadNotas) {
		System.out.println("Las notas son "+mostrarNotas);
		}
		
		
		
		System.out.println("Del alumno "+apellido);
		
	}

}
