package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double num1 = receba.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double num2 = receba.nextDouble();
		
		double div = (num1/num2);
		
		System.out.println("Esta é a divisão do " + num1 + " pelo " + num2 + ": " + div);
	}

}
