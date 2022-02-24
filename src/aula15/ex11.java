package aula15;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		System.out.println("######## Vamos calcular seu novo salário ########");
		System.out.println("Digite o seu salário atual R$");
		double salarioAntigo = entrada.nextDouble();
		double salarioAtual = 0;
		String percentual = "";
		if (salarioAntigo <= 280){
			salarioAtual = salarioAntigo + ((salarioAntigo * 20) / 100);
			percentual = "20%";
		} else if (salarioAntigo > 280 && salarioAntigo <= 700){
			salarioAtual = salarioAntigo + ((salarioAntigo * 15) / 100); 
			percentual = "15%";
		} else if (salarioAntigo > 700 && salarioAntigo <= 1500 ){
			salarioAtual = salarioAntigo + ((salarioAntigo * 10) / 100);
			percentual = "10%";
		} else if (salarioAntigo > 1500){
			salarioAtual = salarioAntigo + ((salarioAntigo * 5) / 100);
			percentual = "5%";
		}
		
		System.out.println("######## Seus dados: ########");
		System.out.println("Seu salário antigo R$" + salarioAntigo);
		System.out.println("Você teve um aumento de " + percentual);
		System.out.println("Seu novo salário é R$" + salarioAtual);
	}

}
