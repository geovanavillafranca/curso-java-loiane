package aula15;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int entrada1 = entrada.nextInt();
		System.out.println("Entrada 1: " + entrada1);

		System.out.println("Digite o segundo valor: ");
		int entrada2 = entrada.nextInt();
		System.out.println("Entrada 2: " + entrada2);
		
		if (entrada1 > entrada2) {
			System.out.println("O número " + entrada1 + " é maior que o número " + entrada2 );
		}else if (entrada1 < entrada2) {
			System.out.println("O número " + entrada2 + " é maior que o número " + entrada1 );
		} else {
			System.out.println("Valores iguais.");
		}
	}

}
