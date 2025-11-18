package prjAula05;
import java.util.Scanner;

public class NotaMedia {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double n1,  n2, n3, n4, nm, mi, ex;

		System.out.println ("digite a primeira nota");
		n1 = ler.nextDouble();
		
		System.out.println ("digite a segunda nota");
		n2 = ler.nextDouble();
		
		System.out.println ("digite a terceira nota");
		n3 = ler.nextDouble();
		
		System.out.println ("digite a quarta nota");
		n4 = ler.nextDouble();
		
		mi = (n1+n2+n3+n4)/4;
		
		if (mi >=7) {
			System.out.println("aprovado");
		} else if (mi<5) {
			System.out.println("reprovado");
		} else {
			System.out.println("você está em exame");
			System.out.println ("digite a nota do exame");
			ex = ler.nextDouble();
			nm = (mi+ex)/2;
			System.out.println (nm);
			if (nm >=7) {
				System.out.println("aprovado pós exame");
			} else {
				System.out.println("reprovado pós exame");
			}
			ler.close();
		} 
	}
	

}
