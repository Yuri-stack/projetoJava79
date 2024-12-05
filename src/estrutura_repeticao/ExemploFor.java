package estrutura_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
		String nome;
		int contador;
        Scanner leia = new Scanner(System.in);
               
        /*System.out.println("Digite o 2º nome: ");
        nome2 = leia.nextLine();
        System.out.println("O 2º nome é: "  + nome2);
        
        System.out.println("Digite o 3º nome: ");
        nome3 = leia.nextLine();
        System.out.println("O 3º nome é: "  + nome3);*/
        
        /*
         * contador = 1 
         * contador = 1 + 1
         * contador = 2 + 1
         * contador = 3 + 1
         * 
         * contador++ == contador = contador + 1
         * */
        
        for(contador = 1; contador <= 3; contador++) {
            System.out.println("Digite o " + contador + "º nome: ");
            nome = leia.nextLine();
            System.out.println("O " + contador + "º nome é: " + nome);       
        }
        
        System.out.println("Cabô");
        
        leia.close();
		
	}

}
