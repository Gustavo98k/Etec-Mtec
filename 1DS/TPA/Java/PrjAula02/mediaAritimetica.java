package prjAula02;
import java.util.Scanner;

public class mediaAritimetica {
        public static void main (String[] args) {
        	
        	Scanner ler = new Scanner (System.in);
        	
        	double nota1, nota2, nota3, nota4, media;
        	
        	System.out.println("digite a nota 1");
        	nota1 = ler.nextDouble();
        	
        	System.out.println("digite a nota 2");
        	nota2 = ler.nextDouble();
        	
        	System.out.println("digite a nota 3");
        	nota3 = ler.nextDouble();
        	
        	System.out.println("digite a nota 4");
        	nota4 = ler.nextDouble();
        	
        	media = (nota1+nota2+nota3+nota4)/4;
        	System.out.println("Sua média é: "+media);
        	ler.close();
        }
}
