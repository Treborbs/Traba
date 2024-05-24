package ejercicio4;

import java.util.Scanner;

public class ejercicio42 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int numeroAleatorio = (int) (Math.random()*50);
		int[] nombre = new int [4];
		
		
		System.out.println(numeroAleatorio);
		
		for (int i = 0;i < 4; i++) {
			System.out.println("Ingrese numero");
			nombre[i]=datos.nextInt();
		
			if(numeroAleatorio == nombre[i]) {
				System.out.println("Felisidades ganaste");
				break;
			}
			if(i==2) {
				System.out.println("Perdiste bro");
				break;
			}
			
		}
		
		
		
	}

}
