package ejercicio4;

import java.util.Scanner;

public class Ejercicio26 {
public static void main(String[] args) {
	Scanner datos = new Scanner(System.in);
	
	
	boolean continuar = true;
	String No;
	String Si;
	
	Si = "SI";
	
	
 	do {  
 		System.out.println("Puedo salir papa");
		No = datos.next();
	if(No.equals("SI") ){
		System.out.println("Muchas grasias Edgar");
		continuar = false;
	}	
 	}
 	while(continuar);
 		
 	
 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
