package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto: ");
		double preco = receba.nextDouble();
		
		double desc = preco * 10/100;
		
		double novo = preco - desc;
		
		System.out.println("O novo preço do produto é: " + novo);

	}

}
