package prjAula15;

import java.util.Scanner;

public class VetorRelacaoDivi {
	 public static void main(String[] args) {
		    Scanner ler = new Scanner(System.in);
	        int[] a = new int[10];
	        int i,j;

	        for (i = 0; i < 10; i++) {
	            System.out.print("Digite o valor " + (i + 1) + ": ");
	            a[i] = ler.nextInt();
	        }


	        for (i = 0; i < 10; i++) {
	            System.out.println("Elemento: " + a[i]);
	            System.out.println("Divisores:");
	            for (j = 1; j <= a[i]; j++) {
	                if (a[i] % j == 0) {
	                    System.out.println(j);
	                }
	            }
	            System.out.println();
	        }
	        ler.close();
	    }
	 
}
