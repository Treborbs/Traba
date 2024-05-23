package ejercicio4;

import java.util.Scanner;

public class ejercicio35p {
	public static void main(String[] args) {
		 Scanner datos = new Scanner(System.in);
		 
		 int nota1=0, nota2=0, nota3=0, nota4=0, nota5=0;
		 int suma;
		 int ingresar;
		 int min = 10;
		 int max = 10;
				 
		 
		 for (int i = 1;i <= 5; i++) {
			 System.out.println("Ingrese las calificaciones del alumno");
			  ingresar=datos.nextInt();
			 
			 if(ingresar < min) {
				 min=ingresar;
			 }
			 if (ingresar > max) {
				 max=ingresar;
			 }
			 if (i==1) {
				 nota1= ingresar;
			 }
			 
			 if(i==2) {
				 nota2	= ingresar ;
			 }
			 if(i==3) {
				 nota3 = ingresar;
			 }
			 
			 if (i==4) {
				 nota4 =ingresar;
			 }
			 
			 if (i==5) {
				 nota5 =ingresar;
			 }
			 
			 
		 }
		 
		 suma= nota1+nota2+nota3+nota4+nota5;
		 int promedio= suma/5;
		 
		 System.out.println("La nota mas baja es "+ min);
		 System.out.println("La nota mas alta es "+ max);
		 System.out.println("El promedio de las notas es "+promedio);
		 
		 
		 
			}
		 
		
		 
				 
	}			
	
