package ejercicio4;

import java.util.Scanner;

public class ejercicio29 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Ingrese NO para iniciar");
		String edgar=datos.next();
		
		if(edgar.equals("NO") ){
		
		for (int i = 100;i >= 20; i--) {	
			System.out.println(""+i+"%");
			Thread.sleep(20);
			
		}
		System.out.println("Bateria baja");
		Thread.sleep(1000);
		for(int i = 20;i >= 0; i--) {
			System.out.println(""+i+"%");

			if(i==0) {
				
			
			System.err.println("Se acabo tu bateria");
			}//El 29 tiene menos lineas
		}
		}		
	}
}	
