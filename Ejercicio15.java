package ejercicio4;
import java.util.Scanner;
public class Ejercicio15 {
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int preciototal ;
		
		
		System.out.println("El costo de su compra es: ");
		 int costo = datos.nextInt(); 
		
		if(costo>15000){
			System.out.println("Tiene un descuento del 10%");
			preciototal =costo*10;
			int preciototal1 = preciototal / 100;
			int preciototal2 = costo - preciototal1;
			
			System.out.println("Su precio total es "+preciototal2);
		}
		else {
			System.out.println("Su precio total es "+costo);
		}
		
		
		
		
		
	}
}
