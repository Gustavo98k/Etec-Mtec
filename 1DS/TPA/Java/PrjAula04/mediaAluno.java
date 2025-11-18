package prjAula04;
import java.util.Scanner;

public class mediaAluno {
	public static void main(String[] args) {

Scanner ga = new Scanner(System.in);
		
		double nota1, nota2, mediaAluno, novaMedia, notaExame;
		
		System.out.println("Digite o valor da primeira nota:");
		nota1 = ga.nextDouble();
		
		System.out.println("Digite o valor da segunda nota:");
		nota2 = ga.nextDouble();
		
		mediaAluno = (nota1 + nota2) / 2;
		
		if (mediaAluno < 3) {
			System.out.println("Este aluno está reprovado .");
		} else if (mediaAluno < 6) {
			System.out.println("Este aluno está de recuperação.");
			
			System.out.println("Digite a nota do exame:");
			notaExame = ga.nextDouble();
			
			novaMedia = (mediaAluno + notaExame) / 2;
			
			if (novaMedia >= 6) {
				System.out.println("Este aluno está aprovado após recuperação.");
			} else {
				System.out.println("Este aluno está reprovado após recuperação.");
			}
			
		} else {
			System.out.println("Este aluno está aprovado.");
		}
		
		ga.close();
	}
}