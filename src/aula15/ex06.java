package aula15;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeira n�mero:");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro n�mero:");
		int num3 = entrada.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O n�mero " + num1 + " � o maior");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O n�mero " + num2 + " � o maior");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("O n�mero " + num3 + " � o maior"); 
		} else {
			System.out.println("Valores iguais");
		}
		
	}

}
