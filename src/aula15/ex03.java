package aula15;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o sexo? [F] | [M] ");
		String sexo = entrada.nextLine();
		if (sexo.equals("M") || sexo.equals("m")) {
			System.out.println("Masculino");
		} else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Sexo inválido");
		}
	}

}
