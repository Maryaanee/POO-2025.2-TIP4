package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);
		
		double n1, n2, n3, n4, media;
		
		System.out.println("Digite a nota 1: ");
		n1 = receba.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		n2 = receba.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		n3 = receba.nextDouble();
		
		System.out.println("Digite a nota 4: ");
		n4 = receba.nextDouble();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("A média aritmetica é: " + media);
		
		if (media < 7) {
			System.out.println("Reprovado!");
		}
		
		else
			System.out.println("Aprovado");
	}

}
