package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero: ");
		double num1 = receba.nextDouble();
		
		System.out.println("Escreva o segundo numero: ");
		double num2 = receba.nextDouble();
		
		System.out.println("Escreva o terceiro numero: ");
		double num3 = receba.nextDouble();
		
		double multi = num1 * num2 * num3;
		
		System.out.println("A multiplicação desses 3 numeros é: " + multi);

	}

}
