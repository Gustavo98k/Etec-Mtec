package prjAula04;
import java.util.Scanner;

public class RaizesX {
	public static void main (String args []) {
		
		Scanner ga = new Scanner(System.in);
		
		double a, b, c, raiz1, raiz2, delta;
		
		System.out.println("digite o valor de A:");
		a = ga.nextDouble();
		
		System.out.println("digite o valor de B:");
		b = ga.nextDouble();
		
		System.out.println("digite o valor de C:");
		c = ga.nextDouble();
		
		delta = b*b-4*a*c;
				
		raiz1 = (-b+Math.sqrt(delta))/(2*a);
				
		raiz2 = (-b-Math.sqrt(delta))/(2*a);
		
		if(delta<0) {
			System.out.println("Não existem raízes reais para a equação");
		} else if (delta==0) {
			System.out.println("Existe apenas uma raiz real para a equação");
		} else {
			System.out.println("Existem duas raízes reais para a equação");
		}
		ga.close();
			
	}

}
