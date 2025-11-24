package prjAula07;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade, i=1;
		
		while (i<=5) {
		System.out.println("Escreva a idade:");
		idade = ler.nextInt();
		
		if (idade<18) {
			System.out.println("Essa pessoa é menor de idade");
		} else {
			System.out.println("Essa pessoa é maior de idade");
		} i++;
		}
		ler.close();
	}

}
