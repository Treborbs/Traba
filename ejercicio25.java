package ejercicio4;
import java.util.Scanner;
public class ejercicio25 {
public static void main(String[] args) {
	
	Scanner datos =  new Scanner(System.in);
	
	boolean continuar = true;
	String No;
	String Si = "Si";
	
 	do {  
 		System.out.println("Puedo salir papa");
		No = datos.next();
		System.out.println(""+No);
		
		
	if(No == Si ){
		System.out.println("Muchas grasias Edgar");
		continuar = false;
	}
	
		
		
		
 	}
 	while(continuar);
 		
 	
 	
	
}
 	}	

