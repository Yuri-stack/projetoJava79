package vetor;

import java.util.Scanner;

public class ExemploVetorUsuario {

	public static void main(String[] args) {
		
		// tipo nome_vetor[] = new tipo[quantidade_valores];
		int numeros[] = new int[3]; // 0 - 1 - 2
		// 0[ 8 ] 1[] 2[]
		
		int indice;
				
        Scanner leia = new Scanner(System.in);
        
        for(indice = 0; indice < 3; indice ++) {
        	
            System.out.println("Digite o " + (indice + 1)  +"º Número: ");
            numeros[indice] = leia.nextInt();	// ler algo e adicionar ao vetor
            
            // numeros[0] = 2
            
        }
                       
        System.out.println("\nOs números digitados foram: \n");
        
        for(indice = 0; indice < 3; indice++) {
            System.out.println((indice + 1) + "º número: " + numeros[indice]);
        }

	}

}
