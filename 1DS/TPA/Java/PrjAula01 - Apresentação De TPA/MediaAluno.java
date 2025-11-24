package prjAula01;
import java.util.Scanner;

public class MediaAluno {
   public static void main (String[] args) {
   
	//criando um Scanner chamado ler
	   Scanner ler = new Scanner (System.in);
	   
	   double nota1, nota2, media;
	   
	   System.out.println("digite a nota 1");
	   nota1 = ler.nextDouble(); // leia a (nota 1) 
	   
	   System.out.println("digite a nota 2");
	   nota2 = ler.nextDouble();
	   
	   media = (nota1+nota2)/2;
	   System.out.println("Sua média é: "+ media);
	   ler.close();
   }
}
