package introducao;

import java.util.Scanner; // Importando Scanner para dentro da Classe

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variaveis
		String nome;
		float temperatura;
		float fahrenheit;
		
		// Construindo o leia
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados - Pedir/Inserir o nome, temperatura
		System.out.println("Insira o seu nome: ");
		nome = leia.next(); // .nextLine();
		
		System.out.println("Insira a temperatura em Celsius: ");
		temperatura = leia.nextFloat();
		
		// Processamento
		fahrenheit = temperatura * 1.8f + 32;
		
		// Saída dos Dados
		System.out.println("Bom dia, " + nome);
		System.out.printf("A temperatura em Fahrenhiet é %.2f F.", fahrenheit); 

		System.out.println("\nTeste"); // Concatenação
		
	}

}
