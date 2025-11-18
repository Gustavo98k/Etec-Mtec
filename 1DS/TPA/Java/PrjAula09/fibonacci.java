package prjAula09;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da série de Fibonacci: ");
        int n = scanner.nextInt();

        int a = 1;
        int b = 1;
        int i = 0;

        System.out.println("Série de Fibonacci até o " + n + "º termo:");

        do {
            if (i < 2) {
                System.out.print(a + " ");
            } else {
                int proximo = a + b;
                System.out.print(proximo + " ");
                a = b;
                b = proximo;
            }
            i++;
        } while (i <= n);

        scanner.close();
}
}
