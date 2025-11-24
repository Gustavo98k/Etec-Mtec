package prjAula11;

import java.util.Scanner;

public class DiaMesAnoSequencia {
    public static void main(String[] args) {
        int dia, ano, diaFinal, mes, i = 1;
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("Digite o dia:");
            dia = ler.nextInt();
            System.out.println("Digite o mês:");
            mes = ler.nextInt();
            System.out.println("Digite o ano:");
            ano = ler.nextInt();
            
            if (mes < 1 || mes > 12) {
            	System.out.println("Data inválida");
            }

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                diaFinal = 31;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diaFinal = 30;
            } else {
                if (ano % 4 == 0) {
                    if (ano % 100 == 0) {
                        if (ano % 400 == 0) {
                            diaFinal = 29;
                        } else {
                            diaFinal = 28;
                        }
                    } else {
                    	diaFinal = 29;
                    }
                } else {
                	diaFinal = 28;
                }
            }
            
            if (dia < 1 || dia > diaFinal) {
            	System.out.println("Data inválida");
            	continue;
            }

            if (dia == diaFinal) {
                dia = 1;
                mes++;
                if (mes > 12) {
                    mes = 1;
                    ano++;
                }
            } else {
                dia++;
            }

            System.out.println("O próximo dia é:"+ dia+ "/" + mes+ "/"+ ano);

            System.out.println("\nDeseja continuar ? 1-Sim / 2-Não");
            i = ler.nextInt();
            
        } while (i == 1);
        ler.close();
    } 
    
}