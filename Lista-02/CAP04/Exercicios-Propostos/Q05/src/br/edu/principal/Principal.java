package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		
		double num1, num2, operacao;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = receba.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		num2 = receba.nextDouble();
		
		int opcao;
		
		System.out.println("Digite uma opção de 1 a 4: ");
		opcao = receba.nextInt();
		
		switch (opcao) {
		
		case 1:
			operacao = (num1 + num2) / 2;
			System.out.println("A média entre " + num1 + " e " + num2 + " é: " + operacao);
			break;
		
		case 2:
			if (num1 > num2) {
				operacao = (num1 - num2);
				System.out.println("A diferença de " + num1 + " para " + num2 + " é: " + operacao);
			}
			
			else if (num2 > num1) {
				operacao = (num2 - num1);
				System.out.println("A diferença de " + num2 + " para " + num1 + " é: " + operacao);
			}
			
			else
				System.out.println("Os numeros são iguais.");
			break;
			
		case 3:
			operacao = (num1 * num2);
			System.out.println("O produto de " + num1 + " entre " + num2 + " é: " + operacao);
			break;
			
		case 4:
			if (num2 != 0) {
				operacao = (num1 / num2);
				System.out.println("A divisão de " + num1 + " pelo " + num2 + " é: " + operacao);
			}
			
			else {
				System.out.println("Não existe divisão com o divisor 0.");
			}
			break;
			
		default:
			System.out.println("Opção invalida!");
			break;
		}

	}

}
