package aula15;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com uma letra");
		String letra = entrada.next();
		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida");
		} else { 
		
			switch(letra) {
			case "A": 
			case "E": 
			case "I": 
			case "O":
			case "U":
			case "a": 
			case "e": 
			case "i": 
			case "o":
			case "u": System.out.println("Volgal"); break;
			default: System.out.println("Consoante");
			}
		} 

	}

}
