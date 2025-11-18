package prjAula15;

public class VetorElevado2 {
    public static void main(String[] args) {
        int[] a = new int[11];
        int i, potencia;
        
        potencia = 1;
        for (i = 0; i <= 10; i++) {
            a[i] = potencia;
            potencia = potencia * 2;
        }

        System.out.println("Vetor A:");
        for (i = 0; i <= 10; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}