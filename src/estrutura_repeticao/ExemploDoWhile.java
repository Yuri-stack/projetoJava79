package estrutura_repeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		int numero, resultado, contador = 21;
        Scanner leia = new Scanner(System.in);

        do { // Bloco de Repetição
        	
            System.out.println("\nDigite um número inteiro: ");
            numero = leia.nextInt();

            resultado = numero * 5;

            System.out.println("\nO resultado da multiplicação é: " + resultado);
            
            // contador = contador + 1; 

        } while (contador <= 20); // condição limite para repetir
        // 21 <= 20 == falso

	}

}
