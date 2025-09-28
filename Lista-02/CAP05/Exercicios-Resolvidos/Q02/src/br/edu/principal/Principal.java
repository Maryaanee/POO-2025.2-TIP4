package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		
		int n, e, i, j, fat;
		
		System.out.println("Digite um valor: ");
		n = receba.nextInt();
		
		e = 1;
		
		for (i = 1; i <= n; i++) {
			fat = 1;
			
			for (j = 1; j <= i; j++) {
				fat = fat * j;
			}
			e = e + 1/fat;
		}
		System.out.println("O valor de E é: " + e);
		
	}

}
