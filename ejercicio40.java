package ejercicio4;

import java.util.Scanner;

public class ejercicio40 {
public static void main(String[] args) {
	Scanner datos = new Scanner(System.in);
	
	int[] temperatura = new int[6];
	
	
	for (int i = 1;i <= 5; i++) {
		System.out.println("Ingrese la temperatura "+i);
		temperatura[i]=datos.nextInt();

	}
	
	int suma = temperatura[1]+ temperatura[2]+ temperatura[3]+ temperatura[4] + temperatura[5];
	int promedio = suma/5;
	
	
	System.out.println("El promedio de la temperatura es "+promedio+"°");
	
	
}
}
