package ejercicio4;

import java.util.Scanner;

public class ejrecicio20 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos =  new Scanner(System.in);
		
		int follow = 0;
		
		while (follow < 100) {
			follow++;
			System.out.println("Tiene "+ follow +" Seguidores");
			Thread.sleep(20);
		}
		System.out.println("Felicidades llegastea los 100 followers");
	}
}
