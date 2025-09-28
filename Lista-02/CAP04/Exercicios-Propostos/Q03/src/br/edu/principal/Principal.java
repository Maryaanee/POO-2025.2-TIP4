package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = receba.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		num2 = receba.nextDouble();
		
		if (num1 < num2) {
			System.out.println("O numero " + num1 + " é o menor.");
		}
		
		else if (num1 > num2) {
			System.out.println("O numero " + num2 + " é o menor.");
		}
		
		else
			System.out.println("Os numero são iguais");

	}

}
