package prjAula08;
import java.util.Scanner;

public class ExUsuarioEscolhe {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1,  n2, m;
		int i=2;

		do {
		System.out.println ("digite a primeira nota");
		n1 = ler.nextDouble();
		
		System.out.println ("digite a segunda nota");
		n2 = ler.nextDouble(); 
		
		m = (n1+n2)/2;
		
		System.out.println("Media = "+m);
		System.out.println("\n Deseja continuar");
		}
	}

}
