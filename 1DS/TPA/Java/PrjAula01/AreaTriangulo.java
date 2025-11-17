package prjAula01;
import java.util.Scanner;

public class AreaTriangulo {
     public static void main (String[] args) {
    	 
    	 //criando um scanner chamado ler
    	 Scanner ler = new Scanner(System.in);
    	 
    	double base, h, area;
    	
    	System.out.println("digite a base");
    	base =ler.nextDouble();
    	
    	System.out.println("Digite a altura");
    	h = ler.nextDouble();
    	
    	area = (base*h)/2;
    	System.out.println("Sua área é: "+ area);
    	ler.close();
    			
    			
    	
     }


}
