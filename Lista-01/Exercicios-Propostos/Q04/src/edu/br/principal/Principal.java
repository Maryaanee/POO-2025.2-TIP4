package edu.br.principal;

import java.util.Scanner;
//Faça um programa que receba duas notas, calcule e mostre a média ponderada dessas notas, consi-
//derando peso 2 para a primeira e peso 3 para a segunda.

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva a N1: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Escreva a N2: ");
		double nota2 = entrada.nextDouble();
		
		double media = ((nota1 * 2) + (nota2 * 3)) / 5;
		System.out.println("A média é: " + media);
		

	}

}
