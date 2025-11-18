package prjAula15;

import java.util.Scanner;

public class VetorQuantosPares {
	    public static void main(String[] args) {
	    	Scanner ler = new Scanner(System.in);
	    	
	        int[] a = new int[10];
	        int i,j,k;
	        
	        for (i = 0; i < 10; i++) {
	            System.out.print("Digite o valor " + (i + 1) + ": ");
	            a[i] = ler.nextInt();	        
	            }


	        for (i = 0; i < 10; i++) {
	            System.out.println("Elemento: " + a[i]);
	            for (j = 0; j <= a[i]; j++) {
	                for (k = j; k <= a[i]; k++) {
	                    System.out.println("(" + j + ", " + k + ")");
	                }
	            }
	            System.out.println();
	        }
	        ler.close();
	    }
	    
	}


