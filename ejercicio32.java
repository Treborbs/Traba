package ejercicio4;

import java.util.Scanner;

public class ejercicio32 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Eleji un numero para multiplicar");
		int edgar =datos.nextInt();
		int yoshi = 1;
		int yu;
		
		
		for (int i = 1;i <= 20; i++) {	
			yu=edgar*yoshi;
			System.out.println(""+edgar+"x"+yoshi+"="+yu);
			yoshi++;
			
			Thread.sleep(20);
		
		}
	}

}
