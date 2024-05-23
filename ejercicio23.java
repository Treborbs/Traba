package ejercicio4;

import java.util.Scanner;

public class ejercicio23 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos =  new Scanner(System.in);
		
		boolean continuar = true;
		int numero1;
		int intentos=0;
		
		int numeroAleatorio = (int) (Math.random()*99);
			System.out.println("Ingrese un numero entre (0-99)");
			numero1 = datos.nextInt();
		if (numero1== numeroAleatorio) {
			System.out.println("Ganaste");
		}
		else {
			while(continuar) {
				intentos++;
			System.err.println("Fallaste Intentelo de nuevo (0-99)");
			numero1 = datos.nextInt();

			if (numero1==numeroAleatorio) {
				System.out.println("GG, Ganaste");
				System.out.println("Tuvo "+intentos+" Intentos");
				continuar = false;
			}
			else if (intentos == 5) {
				continuar = false;
				System.err.println("Se te acabaron los intentos");
			}
			}
			
			Thread.sleep(20);
		}	
		
		}
		}

		
		
		

		
	

