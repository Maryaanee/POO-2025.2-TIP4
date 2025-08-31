package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo");
		double raio = receba.nextDouble();
		
		double area = 3.1415 * (raio * raio);
		
		System.out.println("A area do circulo é: " + area);

	}

}
