package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double nota1,nota2,nota3,peso1,peso2,peso3,media;
		Scanner entrada = new Scanner(System.in);
	    
		System.out.println("Digite a N1: ");
		nota1 = entrada.nextFloat();
		System.out.println("Digite a N2: ");
		nota2 = entrada.nextFloat();
		System.out.println("Digite a N3: ");
		nota3 = entrada.nextFloat();
		System.out.println("Digite o peso da N1: ");
		peso1 = entrada.nextFloat();
		System.out.println("Digite o peso da N2: ");
		peso2 = entrada.nextFloat();
		System.out.println("Digite o peso da N3: ");
		peso3 = entrada.nextFloat();	

		media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3)/(peso1 + peso2 + peso3);
		
		System.out.println("A média é: " + media);	


	}

}