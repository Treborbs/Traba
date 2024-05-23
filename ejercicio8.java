package ejercicio4;

import java.util.Scanner;

public class ejercicio8 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
        float num1; 
		
		System.out.println("Ingrese un numero: ");
		num1 = datos.nextFloat();
		
				double resultado       =  Math.pow(num1, 2);
				double numeroAleatorio =  Math.random()*1;
                double resultado2      =  resultado + numeroAleatorio;
                double resultado3      =  resultado2 * 7;	
                double raiz_cuadrada   =  Math.sqrt(resultado3);
                
                
                System.out.println("El resultado es: " + raiz_cuadrada);
	}

}
