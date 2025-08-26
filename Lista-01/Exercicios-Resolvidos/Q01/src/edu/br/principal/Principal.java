package edu.br.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1, n2, n3, n4, soma;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o N1: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o N2: ");
		n2 = entrada.nextInt();
		System.out.println("Digite o N3: ");
		n3 = entrada.nextInt();
		System.out.println("Digite o N4: ");
		n4 = entrada.nextInt();

		soma = n1 + n2 + n3 + n4;

		System.out.println("A soma dos quatro números é: " + soma);


	}

}
