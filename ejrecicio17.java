package ejercicio4;
import java.util.Scanner;
public class ejrecicio17 {
	public static void main(String[] args){
		
		Scanner datos = new Scanner(System.in);
			
		float n1,n2,n3;
		
		System.out.println("Ingrese valor n1");
		n1=datos.nextFloat();
		
		System.out.println("Ingrese valo n2");
		n2=datos.nextFloat();
				
		System.out.println("Ingrese valor n3");
		n3=datos.nextFloat();
		
		if (n1>n2 && n1>n3) {
			 System.out.println("n1 es el numero mas alto");
		       if (n2>n3) {
		    	   System.out.println("n2 es el numero mediano");
		    		System.out.println("n3 es el numero menor");
		       }
		    	  else {
		    		System.out.println("n3 es el numero menor");
			    	  System.out.println("n2 es el numero mediano");
		    	  }
		       
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("n2 es el numero mas alto");
			if (n1>n3) {
				System.out.println("n1 es el numero mediano");
				System.out.println("n3 es el numero menor");
				
			}
			else {
				System.out.println("n3 es el numero mediano");
				System.out.println("n1 es el numero menor");
			}
		}
		else if (n3>n1 && n3>n1){
			System.out.println("n3 es el numero mas alto");
			if (n2>n1) {
				System.out.println("n2 es el numero mediano");
				System.out.println("n1 es el numero menor");
				
			}
			else {
				System.out.println("n1 es el numero mediano");
				System.out.println("n2 es el numero menor");
			}
		}
		
		else {
			System.out.println("cp");
		}
		
		
	}
}
