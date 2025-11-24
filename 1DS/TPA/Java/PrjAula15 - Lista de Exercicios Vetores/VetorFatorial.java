package prjAula15;

import java.util.Scanner;

public class VetorFatorial {
	  public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int[] a = new int[15];
	        int[] b = new int[15];
	        int i, j, fatorial;


	        for (i = 0; i < 15; i++) {
	            System.out.print("Digite o elemento " + (i + 1) + ": ");
	            a[i] = ler.nextInt();
	        }
	        
	        for (i = 0; i < 15; i++) {
	            fatorial = 1;
	            for (j = 1; j <= a[i]; j++) {
	                fatorial *= j;
	            }
	            b[i] = fatorial;
	        }
	        
	        System.out.println("Vetor B:");
	        for (i = 0; i < 15; i++) {
	            System.out.println(b[i]);
	            ler.close();
	        }
	    }
}
