package prjAula04;
import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		
		Scanner ga = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("digite o valor de A:");
		a = ga.nextDouble();
		
		System.out.println("digite o valor de B:");
		b = ga.nextDouble();
		
		System.out.println("digite o valor de C:");
		c = ga.nextDouble();
		
		if (a+b<=c || a+c<=b || b+c<=a) {
			System.out.println("Isso não forma triângulo");
		} else if (a==b && b==c) {
			System.out.println("Esse triângulo é equilátero");
		} else if (a==b || b==c || a==c) {
			System.out.println("Esse triângulo é isósceles");
		} else {
			System.out.println("Esse triângulo é escaleno");
		}
		ga.close();
	}

}
