package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Escreva o valor de um deposito");
		double dep = receba.nextDouble();
		
		System.out.println("Escreva o valor da taxa em juros");		
		double taxa = receba.nextDouble();
		
		double rend = dep * (taxa/100);
		
		double totalNumeric = dep + rend;
		
		System.out.println("O valor do rendimento é:" + rend + "O valor total após o rendimento é: " + totalNumeric);
	}

}
