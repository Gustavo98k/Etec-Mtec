package prjAula07;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=1, n, resultado;
		
		System.out.println("digite o número da tabuada:	");
		n = ler.nextInt();
		
		while (i<=10) {
			resultado = n*i;
			System.out.println(n+"x"+i+"="+resultado);
			i++;
		}
		ler.close();
	}

}
