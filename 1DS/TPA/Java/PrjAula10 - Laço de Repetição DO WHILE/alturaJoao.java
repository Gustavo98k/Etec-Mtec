package prjAula10;

public class alturaJoao {

	public static void main(String[] args) {

		double j=134 , p=145, i=0 ;
		
		do {
			p = p+2;
			j = (j+2.5);
			i++;
		} while (j <p );
		p = p/100;
		j = j/100;
		System.out.println("João e Pedro iram se igualar em "+ i +" anos com as seguintes alturas:"+ p + " " + j);
	}

}
