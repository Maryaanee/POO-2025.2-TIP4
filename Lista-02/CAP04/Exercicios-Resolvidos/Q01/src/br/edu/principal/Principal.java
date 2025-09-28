package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);
		
		double notaT, avalS, exam, media;
		
		System.out.println("Digite a nota do trabalho de lab: ");
		notaT = receba.nextDouble();
		
		System.out.println("Digite a nota da avaliação semestral: ");
		avalS = receba.nextDouble();
		
		System.out.println("Digite a nota do exame final: ");
		exam = receba.nextDouble();
		
		media = (notaT * 2 + avalS * 3 + exam * 5) / (2+3+5);
		
		System.out.println("A média ponderada é: " + media);
		
		if (media >= 8.0 && media <= 10) {
			System.out.println("Conceito A");
		}

		else if (media >= 7 && media < 8.0) {
			System.out.println("Conceito B");

		} else if (media >= 6 && media < 7.0) {
			System.out.println("Conceito C");

		}

		else if (media >= 5 && media < 6.0) {
			System.out.println("Conceito D");

		} else if (media >= 0 && media < 5.0) {
			System.out.println("Conceito E");
		
		}

	}

}
