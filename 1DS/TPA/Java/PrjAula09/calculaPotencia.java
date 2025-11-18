package prjAula09;

import java.util.Scanner;

public class calculaPotencia {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a base: ");
	        double base = scanner.nextDouble();

	        System.out.print("Digite o expoente: ");
	        int expoente = scanner.nextInt();

	        double resultado = 1;
	        int i = 0;

	        do {
	            resultado *= base;
	            i++;
	        } while (i < expoente);

	        System.out.println("A potência de " + base + " elevado a " + expoente + " é: " + resultado);

	        scanner.close();
	    }
	
	}


