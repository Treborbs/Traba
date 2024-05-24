package ejercicio4;

import java.util.Scanner;

public class ejercicio43 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int[]  numero = new int[5];
		numero[0]=1;
		numero[1]=2;
		numero[2]=3;
		numero[3]=-4;
		numero[4]=5;

		
		for (int i = 0;i < 5; i++) {
			
			if(numero[i]<0) {
				continue;
				
			}
			
			System.out.println(numero[i]);
			
			
		}
		
		
		
		
	}
	

}
