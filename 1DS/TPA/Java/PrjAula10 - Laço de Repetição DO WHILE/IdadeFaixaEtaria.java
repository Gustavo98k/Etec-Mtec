package prjAula10;
import java.util.Scanner;

public class IdadeFaixaEtaria {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int idade, i=1, f1=0, f2=0, f3=0, f4=0, f5=0;
				
		do {
			
			System.out.println("Digite a sua idade:");
			idade = ler.nextInt();
			
			if (idade<16) {
				System.out.println("você está na 1° faixa");
				f1 = f1 + 1;
			} else if (idade<31) {
				System.out.println("você está na 2° faixa");
				f2 = f2 + 1;
			} else if (idade<46) {
				System.out.println("você está na 3° faixa");
				f3 = f3 + 1;
			} else if (idade<61) {
				System.out.println("você está na 4° faixa");
				f4 = f4 + 1;
			} else {
				System.out.println("você está na 5° faixa");
				f5 = f5 + 1;
				
				
			}System.out.println ("\nDeseja continuar ? 1-Sim / 2-Não");
			i = ler.nextInt();
			
			
			
		}while (i==1);
		
		
		ler.close();
	}

}
