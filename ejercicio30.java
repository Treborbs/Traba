package ejercicio4;

import java.util.Scanner;

public class ejercicio30 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		
		for (int i = 0;i <= 100; i++) {	
			System.out.println(""+i+" seguidores");
			Thread.sleep(20);
		
		}	
		System.out.println("Llegaste a los 100 seguidores");
	}

}
