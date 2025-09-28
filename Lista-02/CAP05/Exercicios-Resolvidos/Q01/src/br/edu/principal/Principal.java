package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double i, sal, ano_atual, sal_novo, percentual;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o ano atual: ");
		ano_atual = input.nextDouble();
		
		sal = 1000;
		percentual = 1.5/100;
		sal_novo = sal + percentual * sal;
		
		for(i = 2007; i <= ano_atual; i++) {
			percentual =  2 * percentual;
			sal_novo = sal_novo + sal_novo * percentual;
			
		}
		System.out.println("O novo salário é R$" + sal_novo);
		

	}

}
