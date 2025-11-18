package prjAula04;
import java.util.Scanner;

public class CarroEconomico {
	public static void main(String[] args) {
		
		Scanner ga = new Scanner(System.in);
		
		double distanciaPerc, tanqueCombus, gastoMedio;
		
		System.out.println("digite a distância percorrida:");
		distanciaPerc = ga.nextDouble();
		
		System.out.println("digite a capacidade do seu tanque de combustível:");
		tanqueCombus = ga.nextDouble();
		
		gastoMedio = distanciaPerc/tanqueCombus; 
		
		System.out.println("seu gasto médio é "+gastoMedio);
		
		if(gastoMedio<10) {
			System.out.println("esse carro não é econômico");
		}else {
			System.out.println("esse carro é econômico");
		}
		ga.close();
	}

}
