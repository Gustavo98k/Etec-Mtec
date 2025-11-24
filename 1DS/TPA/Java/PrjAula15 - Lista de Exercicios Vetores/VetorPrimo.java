package prjAula15;

import java.util.Scanner;

public class VetorPrimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[10];
        int i, j;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            a[i] = ler.nextInt();
        }

        for (i = 0; i < 10; i++) {
            if (a[i] <= 1) {
                System.out.println(a[i] + " não é um número primo.");
            } else {
 
                for (j = 2; j < a[i]; j++) {
                    if (a[i] % j == 0) {
                        System.out.println(a[i] + " não é um número primo.");
                        break;
                    }
                }
                if (j == a[i]) {
                    System.out.println(a[i] + " é um número primo.");
                }
            }
        }
        ler.close();
    }
}