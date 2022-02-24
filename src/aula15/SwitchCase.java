package aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Entre com um dia da semana (1 - 7): ");
		Scanner scan = new Scanner(System.in);
		int diaSemana = scan.nextInt();
		
//		if (diaSemana == 1) {
//			System.out.println("Domingo");
//		} else if (diaSemana == 2) {
//			System.out.println("Segunda");
//		} else if (diaSemana == 3) {
//			System.out.println("Terça");
//		} else if (diaSemana == 4) {
//			System.out.println("Quarta");
//		} else if (diaSemana == 5) {
//			System.out.println("Quinta");
//		} else if (diaSemana == 6) {
//			System.out.println("Sexta");
//		} else if (diaSemana == 7) {
//			System.out.println("Sabado");
//		} else {
//			System.out.println("Nenhum dia da semana!");
//		}
//		
		switch(diaSemana) {
		case 2: 
		case 3: 
		case 4: 
		case 5:
		case 6: System.out.println("Dia útil"); break;
		case 1:
		case 7: System.out.println("Fim de semana"); break;
		default: System.out.println("Nenhum dia da semana!");
		}
		
		
		Scanner entrada = new Scanner(System.in);
		  System.out.println("Digite uma letra entre a e d:");
		  String letra = entrada.nextLine();
		  switch (letra) {
		    case "a":
		      System.out.println("Abacate");
		      break;
		    case "b":
		      System.out.println("Buriti");
		      break;
		    case "c":
		      System.out.println("Caju");
		      break;
		    case "d":
		      System.out.println("Damasco");
		      break;
		    default:
		      System.out.println("Letra inválida");
		  }

	}

}
