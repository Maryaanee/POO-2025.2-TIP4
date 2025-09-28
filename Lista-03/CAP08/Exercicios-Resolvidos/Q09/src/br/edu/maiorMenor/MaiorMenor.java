package br.edu.maiorMenor;

import java.util.Scanner;

public class MaiorMenor {
	
	    /**
	     * Sub-rotina que lê cinco valores inteiros,
	     * determina e mostra o maior e o menor deles.
	     */
	    public static void maior_menor() {
	        // DECLARE i, num, maior, menor NUMÉRICO
	        int i, num, maior = 0, menor = 0;
	        Scanner leitor = new Scanner(System.in);

	        // PARA i ← 1 ATÉ 5 FAÇA
	        for (i = 1; i <= 5; i++) {
	            // ESCREVA “Digite o “, i, “o número: “
	            System.out.print("Digite o " + i + "º número: ");
	            // LEIA num
	            num = leitor.nextInt();

	            // SE i = 1
	            if (i == 1) {
	                // ENTÃO INÍCIO
	                // maior ← num
	                maior = num;
	                // menor ← num
	                menor = num;
	                // FIM
	            } else { // SENÃO INÍCIO
	                // SE num > maior
	                if (num > maior) {
	                    // ENTÃO maior ← num
	                    maior = num;
	                }
	                // SE num < menor
	                if (num < menor) {
	                    // ENTÃO menor ← num
	                    menor = num;
	                }
	                // FIM
	            }
	            // FIM
	        }

	        // ESCREVA “O maior número digitado foi: “,maior
	        System.out.println("\nO maior número digitado foi: " + maior);
	        // ESCREVA “O menor número digitado foi: “,menor
	        System.out.println("O menor número digitado foi: " + menor);
	        
	        
	    }

}
