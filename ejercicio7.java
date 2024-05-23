package ejercicio4;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
	
		
		Scanner datos = new Scanner(System.in);
		float nota;
		
		System.out.println("Qué calificación tendrás en el año en la asignatura Laboratorio de algoritmos y estructura de datos?");
		nota = datos.nextFloat();
		double numeroaleatorio = Math.random()*10;
		System.out.println("Este es tu numero random generado " + numeroaleatorio);
	
	}
	
}
