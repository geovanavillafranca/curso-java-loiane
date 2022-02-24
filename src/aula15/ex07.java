package aula15;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeira número:");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número:");
		int num3 = entrada.nextInt();
		int maior = 0;
		int menor = 0;
		if (num1 > num2 && num1 > num3) {
			maior = num1;
		} else if (num2 > num1 && num2 > num3) {
			maior = num2;
		} else if (num3 > num1 && num3 > num2) {
			maior = num3;
		} if (num1 < num2 && num1 < num3) {
			menor = num1;
		} else if (num2 < num1 && num2 < num3) {
			menor = num2;
		} else if (num3 < num1 && num3 < num2) {
			menor = num3;
		}
		System.out.println("O maior é " + maior + " e o menor é " + menor);
	}

}
