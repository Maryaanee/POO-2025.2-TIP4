package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		
		int i;
	    int num = 0, mult;

	    System.out.printf("Digite um numero: ");
	    num = receba.nextInt();

	    System.out.printf("Tabuada do Nº %d. \n\n", num);

	    for (i = 0; i <= 10; i++) {
	        mult = num * i;
	        System.out.printf("    %d x %d = %d \n", num, i, mult);
	    }
	}
}