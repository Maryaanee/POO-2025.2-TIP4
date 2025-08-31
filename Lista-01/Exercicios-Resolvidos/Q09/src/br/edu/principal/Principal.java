package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Digite a base do triangulo");
		double base = receba.nextDouble();
		
		System.out.println("Digite a altura do tringulo");
		double altura = receba.nextDouble();
		
		double area = (base * altura)/2;
		
		System.out.println("A area deste triangulo é: " + area);
		
	}

}
