package ejercicio4;

import java.util.Scanner;

public class Ejercicio46 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		

		int[]  numero = new int[7];
		numero[0]=1011;
		numero[1]=2367;
		numero[2]=8748;
		numero[3]=9121;
		numero[4]=817;
		numero[5]=6423;
		numero[6]=2034;
		
		String[] nombre = new String[7];
		nombre[0]="Enrique(1011)";
		nombre[1]="Liliana (2367)";
		nombre[2]="Lucas (8748)";
		nombre[3]="Juan (9121)";
		nombre[4]="Fiorella (0817)";
		nombre[5]="Ariel (6423)";
		nombre[6]="Daiana (2034)";
	
		System.out.println("Ingrese numero de socio");
		int ingrese = datos.nextInt();
		
		if(ingrese==numero[0]) {
			System.out.println("El numero le corresponde a Enrique");
			System.out.println(nombre[0]);
		}
		else if(ingrese==numero[1]) {
			System.out.println("El numero le corresponde a Liliana");
			System.out.println(nombre[1]);
		}
		else if(ingrese==numero[2]) {
			System.out.println("El numero le corresponde a Lucas");
			System.out.println(nombre[2]);
		}
		else if(ingrese==numero[3]) {
			System.out.println("El numero le corresponde a Juan");
			System.out.println(nombre[3]);
		}
		else if(ingrese==numero[4]) {
			System.out.println("El numero le corresponde a Fiorella");
			System.out.println(nombre[4]);
		}
		else if(ingrese==numero[5]) {
			System.out.println("El numero le corresponde a Ariel");
			System.out.println(nombre[5]);
		}
		else if(ingrese==numero[6]) {
			System.out.println("El numero le corresponde a Daiana");
			System.out.println(nombre[6]);
			}
		
	}
		
		
		
		
		
	}


