package prjAula15;

import java.util.Scanner;

public class VetorParImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] a = new int[20], b = new int[20];
        int espaco = 0, i;

        for (i = 0; i < 20; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            a[i] = ler.nextInt();
        }
        for (i = 0; i < 20; i++) {
            if (a[i] % 2 == 0) {
                b[espaco++] = a[i];
            }
        }

        for (i = 0; i < 20; i++) {
            if (a[i] % 2 != 0) {
                b[espaco++] = a[i];
            }
        }

        System.out.println("Vetor B:");
        for (i = 0; i < 20; i++) {
            System.out.print(b[i] + " ");
        }
        ler.close();
    }
}