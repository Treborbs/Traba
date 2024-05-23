package ejercicio4;

import java.util.Scanner;

public class ejercicio27 {
 public static void main(String[] args) {
	 Scanner datos = new Scanner(System.in);
		
		int contrasena= 2006;
		int intentos = 0;
		boolean edgar=true;
		
		System.out.println("Ingrese su contra");
		 int contra =datos.nextInt();
		 
		 if(contra == contrasena) {
			 System.out.println("Contrasena corecta");
		 }
			 
		 
		 else { 
			while(edgar) {
			intentos++;
			System.out.println("Tiene "+intentos+" intentos");
			System.out.println("Contraseña incorecta,vuelva a intentarlo");
			contra =datos.nextInt();
			
			if(contra == contrasena) {
				System.out.println("Contrasena corecta");
			 edgar = false;
			}
			
			
			if(intentos==3) {
				System.out.println("Se acabaron tus intentos");
			edgar = false;
			}
			
			
		}
		 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
