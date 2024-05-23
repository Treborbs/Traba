package ejercicio4;

import java.util.Scanner;

public class ejerciciomenos26 {
public static void main(String[] args) {

	Scanner datos = new Scanner(System.in);
	
	int contrasena= 2006;
	int intentos = 0;
	
	System.out.println("Ingrese su contra");
	 int contra =datos.nextInt();
	 
	 if(contra == contrasena) {
		 System.out.println("Contrasena corecta");
	 }
		 
	 
	 else { 
		while(intentos<3||contra!=contrasena) {
		intentos++;
		System.out.println("Tiene "+intentos+" intentos");
		System.out.println("Contraseña incorecta,vuelva a intentarlo");
		contra =datos.nextInt();
		
		if(contra == contrasena) {
			System.out.println("Contrasena corecta");
		 break;
		}
		
		
		if(intentos==3) {
			System.out.println("Se acabaron tus intentos");
		break;
		}
		
		
	}
	 }
}	
}
