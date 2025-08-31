package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero: ");
		double num1 = receba.nextDouble();
		
		System.out.println("Escreva o segundo numero: ");
		double num2 = receba.nextDouble();
		
		double sub = num1 - num2;
		
		System.out.println("Subtração do primeiro pelo segundo numero é: " + sub);

	}

}
