package aula15;

import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um valor:");
	double valor = entrada.nextInt();
	
	if (valor < 0) {
		System.out.println("O " + valor + " é um valor negativo.");
	}else {
		System.out.println("O " + valor + " é um valor positivo.");
		
	}	
	}

}
