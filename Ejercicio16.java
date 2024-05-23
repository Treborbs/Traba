package ejercicio4;
import java.util.Scanner;
public class Ejercicio16 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int horario;
		int minuto;
	    int segundo;
		
		System.out.println("Ingrese su hora ");
		horario= datos.nextInt();
		
		if (horario<0 || horario >=24) {
			System.out.println("Su horario es incorecto");

		}
		else {
			System.out.println("Su valor es correcto");
		}
		
		System.out.println("Ingrese su minuto");
		minuto= datos.nextInt();
		if (minuto <0 || minuto>=60) {
			System.out.println("Su minuto es incorrecto");
		}
		else {
			System.out.println("Su valor es correcto");
		}
		System.out.println("Ingrese su segundo");
		segundo= datos.nextInt();
		if (segundo<=0 || segundo >=60) {
			System.out.println("Su valor es invalido");
		}
		else {
			System.out.println("Su valor es correcto");
		}
	}
	
}
