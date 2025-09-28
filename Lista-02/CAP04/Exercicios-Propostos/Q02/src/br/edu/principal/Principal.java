package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
Scanner receba = new Scanner(System.in);
		
		double num1, num2, media;
		
		System.out.println("Digite a primeira nota: ");
		num1 = receba.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		num2 = receba.nextDouble();
		
		media = (num1 + num2)/2;
		
		System.out.println("A média aritmetica foi: " + media);
		
		if (media >= 7 && media <= 10) {
			System.out.println("Aprovado!");
		}
		
		else if (media >= 3 && media < 7) {
			System.out.println("Exame!");
		}
		
		else if (media >= 0 && media < 3) {
			System.out.println("Reprovado!");
		}
		
		else
			System.out.println("Nota invalida.");
	}

}
