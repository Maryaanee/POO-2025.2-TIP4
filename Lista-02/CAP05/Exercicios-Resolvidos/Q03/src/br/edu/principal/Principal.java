package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        int n, num, i, j, fat;

	        System.out.print("Digite a quantidade de números que serão lidos: ");
	        n = entrada.nextInt();

	        System.out.printf("%-10s %s\n", "Número", "Fatorial");

	        for (i = 1; i <= n; i++) {
	            System.out.print("Digite um número: ");
	            num = entrada.nextInt();

	            fat = 1;
	            for (j = 1; j <= num; j++) {
	                fat = fat * j;
	            }

	            // Imprime o número e seu fatorial imediatamente
	            System.out.printf("%-10d %d\n", num, fat);
	        }
	}
}
	
	