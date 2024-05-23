package ejercicio4;

import java.util.Scanner;

public class ejercicio21 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos =  new Scanner(System.in);
		
		int temperatura=35;
		System.out.println("Su temperatura es de 35°C");
		while(temperatura<85) {
			temperatura = temperatura+2;
			System.out.println(""+temperatura+"°C");
			Thread.sleep(20);
		}
		System.out.println("CUIDADO!, TEMPERATURA PELIGROSA");
		while(temperatura<100) {
			temperatura= temperatura+2;
			System.out.println(""+temperatura+"°C");
			Thread.sleep(1000);
		}
		System.out.println("VALOR EXTREMO. APAGANDO PC");
	}
}
