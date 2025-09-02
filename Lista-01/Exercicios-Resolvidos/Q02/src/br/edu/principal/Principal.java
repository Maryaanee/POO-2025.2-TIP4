package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double nota1,nota2,nota3,media;
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite a N1 para calcular a média: ");
		nota1 = entrada.nextDouble();
		System.out.println("Digite a N2: ");
		nota2 = entrada.nextDouble();
		System.out.println("Digite a N3: ");
		nota3 = entrada.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("A média é:" + media);

	}

}