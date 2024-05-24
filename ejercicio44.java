package ejercicio4;

import java.util.Scanner;

public class ejercicio44 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int numero1=0;
		int[]  numero = new int[4];
		numero[0]=12345678;
		numero[1]=23456789;
		numero[2]=34567890;
		numero[3]=41020177;
		
		int[]  numero2 = new int[4];
		
		numero2[0]=  numero[0] / 2;
	    numero2[1] =  numero[1] / 2;
	    numero2[2]=  numero[2] / 2;
		numero2[3] =  numero[3] / 2;
		
		for (int i = 0;i < 4; i++) {
			if(numero[i] % 2 == 0) {
				continue;
			}
			System.out.println("numero par "+numero[i]);
			
			
		}
		
	}

}
