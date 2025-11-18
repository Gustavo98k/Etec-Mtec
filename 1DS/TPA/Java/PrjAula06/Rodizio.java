package prjAula06;
import java.util.Scanner;

public class Rodizio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int p;
		
		System.out.println("Escreva o último número da placa do carro");
		p = ler.nextInt();
		
		switch(p) {
			case 1:
			case 2:
				System.out.println("Proibido andar segunda-feira");
			break;
			case 3:
			case 4:
				System.out.println("Proibido andar terça-feira");
			break;
			case 5:
			case 6:
				System.out.println("Proibido andar quarta-feira");
			break;
			case 7:
			case 8:
				System.out.println("Proibido andar quinta-feira");
			break;
			case 9:
			case 0:
				System.out.println("Proibido andar sexta-feira");
			break;
			default:
				System.out.println("Número inválido");
		}
		ler.close();

	}

}
