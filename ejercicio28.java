package ejercicio4;

import java.util.Scanner;

public class ejercicio28 {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		int bateria = 100;
		
		System.out.println("Ingrese NO para iniciar");
		String edgar=datos.next();
		
		if(edgar.equals("NO") ) {while(bateria>19 ) {
			System.out.println(""+bateria+"% de bateria");
			bateria--;
			Thread.sleep(20);
			
			if(bateria==19) {
				System.out.println("Bateria baja");
				Thread.sleep(1000);
			}
		}
		while (bateria>0) {
			System.out.println(""+bateria+"% de bateria");
			bateria--;
			Thread.sleep(1000);
		}
		System.err.println("Se acabo tu bateria");
		
	}
	}
}
