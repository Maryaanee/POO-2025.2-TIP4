package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Digite o seu salario base");
		double sal = receba.nextDouble();
		
		double grat = (sal * (0.05));
		
		double impNumeric = (sal * (0.07));
		
		double salReceber = (sal + grat - impNumeric);
		
		System.out.println("Resultado :" + salReceber);
	}

}
