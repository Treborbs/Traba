package ejercicio4;

import java.util.Scanner;

public class ejercicio12 {

public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int Alumno;
		
		System.out.println("Ingrese su calificacion (1-10) ");
		Alumno = datos.nextInt();
		
		if (Alumno >=0 && Alumno <= 3) {
			System.out.println("Insuficiente");
		}
		else if (Alumno>3 && Alumno <6) {
			System.out.println("No Logrado");
		}
		else if (Alumno>=6 && Alumno <= 7) {
			System.out.println("Suficiente");
		}
		else if (Alumno>=8 && Alumno<=9) {
			System.out.println("Notable");
		}
		else if (Alumno==10) {
			System.out.println("Sobresaliente");
		}
		else {
			System.out.println("Ingresó un valor incorrecto.");
		}
			
}
}