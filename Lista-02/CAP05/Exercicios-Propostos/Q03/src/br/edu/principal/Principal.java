package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		        Scanner scanner = new Scanner(System.in);
		        int totalPessoas = 8;

		        // Contadores para cada faixa etária
		        int faixa1 = 0; // Até 15 anos
		        int faixa2 = 0; // 16 a 30 anos
		        int faixa3 = 0; // 31 a 45 anos
		        int faixa4 = 0; // 46 a 60 anos
		        int faixa5 = 0; // Acima de 60 anos

		        // Loop para ler a idade das 8 pessoas
		        for (int i = 1; i <= totalPessoas; i++) {
		            System.out.print("Digite a idade da " + i + "ª pessoa: ");
		            int idade = scanner.nextInt();

		            // Verifica em qual faixa etária a idade se encaixa e incrementa o contador
		            if (idade <= 15) {
		                faixa1++;
		            } else if (idade >= 16 && idade <= 30) {
		                faixa2++;
		            } else if (idade >= 31 && idade <= 45) {
		                faixa3++;
		            } else if (idade >= 46 && idade <= 60) {
		                faixa4++;
		            } else { // Acima de 60
		                faixa5++;
		            }
		        }

		        // a) Mostra a quantidade de pessoas em cada faixa etária
		        System.out.println("\n--- Quantidade por Faixa Etária ---");
		        System.out.println("Até 15 anos: " + faixa1);
		        System.out.println("De 16 a 30 anos: " + faixa2);
		        System.out.println("De 31 a 45 anos: " + faixa3);
		        System.out.println("De 46 a 60 anos: " + faixa4);
		        System.out.println("Acima de 60 anos: " + faixa5);

		        // b) Calcula e mostra a porcentagem da primeira faixa etária
		        double porcentagemFaixa1 = ((double) faixa1 / totalPessoas) * 100;
		        System.out.printf("\nPorcentagem de pessoas na primeira faixa etária: %.2f%%\n", porcentagemFaixa1);

		        // c) Calcula e mostra a porcentagem da última faixa etária
		        double porcentagemFaixa5 = ((double) faixa5 / totalPessoas) * 100;
		        System.out.printf("Porcentagem de pessoas na última faixa etária: %.2f%%\n", porcentagemFaixa5);

		       
		
	}

}
