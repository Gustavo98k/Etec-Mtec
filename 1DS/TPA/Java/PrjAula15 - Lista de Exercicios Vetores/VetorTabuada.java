package prjAula15;
import java.util.Scanner;

public class VetorTabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[5];
        int i, j;
        
        for (i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            a[i] = ler.nextInt();
        }

        for (i = 0; i < 5; i++) {
            System.out.println("Tabuada do " + a[i] + ":");
            for (j = 1; j <= 10; j++) {
                System.out.println(a[i] + " x " + j + " = " + (a[i] * j));
            }
            System.out.println();
        }
        ler.close();
    }
}