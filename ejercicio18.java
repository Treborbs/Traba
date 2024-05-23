package ejercicio4;
import java.util.Scanner;
public class ejercicio18 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String caracter;
		
		System.out.println("Ingrese caracterer entre S-M-L");
		
		caracter = datos.next();
		
		switch(caracter){
		case "S":
			System.out.println("Todavia quedan 5 remeras");
			break;
		case "M":
			System.out.println("Todavia quedan 2 remeras ");
			break;
		case "L":
			System.out.println("No quedan remeras");
			break;
		case "s":
			System.out.println("Todavia quedan 5 remeras");
			break;
		case "m":
			System.out.println("Todavia quedan 2 remeras ");
			break;
		case "l":
			System.out.println("No quedan remeras");
			break;
		}
		
		
		
		
		
		
	}
}
