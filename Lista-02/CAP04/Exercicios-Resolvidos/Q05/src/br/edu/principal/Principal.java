package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double num1, num2, num3, num4;
		
		Scanner receba = new Scanner(System.in);		
		
		System.out.println("Digite três números em ordem crescente: ");
		num1 = receba.nextDouble();		
		num2 = receba.nextDouble();		
		num3 = receba.nextDouble();		
		
		System.out.println("Digite um número (fora de ordem): ");
		num4 = receba.nextDouble();
		
		if (num4 > num3) {
   		System.out.println("A ordem decrescente dos números é: " + num4 + " - " + num3 + " - " + num2 + " - " + num1);
		}
		
		if (num4 > num2 && num4 < num3) {
   		System.out.println("A ordem decrescente dos números é: " + num3 + " - " + num4 + " - " + num2 + " - " + num1);
		}
		
		if (num4 > num1 && num4 < num2) {
   		System.out.println("A ordem decrescente dos números é: " + num3 + " - " + num2 + " - " + num4 + " - " + num1);
		}
		
		if (num4 < num1) {
   		System.out.println("A ordem decrescente dos números é: " + num3 + " - " + num2 + " - " + num1 + " - " + num4);
		}

	}

}