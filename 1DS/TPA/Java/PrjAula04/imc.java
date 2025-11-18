package prjAula04;
import java.util.Scanner;

public class imc {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
				
				double peso, imc,  altura;
				
				System.out.println("digite o seu peso:;");
				peso = in.nextDouble();
				
				System.out.println("digite a sua altura:");
				altura = in.nextDouble();
				
				imc = peso/(altura*altura);
				
				System.out.println("seu imc é "+imc);
			
				
				if(imc<18.5) {
					System.out.println("você está excessivamente magro");					
				} else if (imc<25) {
					System.out.println("você está no peso normal");
				} else if (imc<30) {
					System.out.println("você está com excesso de peso");
				} else if (imc<35) {
					System.out.println("você está obeso(a) grau 1 ");
				} else if (imc<40) {
					System.out.println("você está obeso(a) grau 2 ");
				} else {
					System.out.println ("você está obeso(a) grau 3 ");
				}
				in.close ();
	}

}
