package aula15;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeira número:");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número:");
		int num3 = entrada.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O número " + num1 + " é o maior");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O número " + num2 + " é o maior");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("O número " + num3 + " é o maior"); 
		} else {
			System.out.println("Valores iguais");
		}
		
	}

}
