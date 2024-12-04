package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {

		// Variaveis
		float media;

		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();

		// Processamento
		if (media >= 6) {// 8,5 é maior ou igual a 6
			
			System.out.println("Parabéns, você foi aprovade!");
			
		}else{
			System.out.println("Infelizmente, você foi reprovade.");
		}
		
		leia.close();

	}

}
