package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		
		double codigo = 0, nht = 0, valor = 0,
		sal_min, sal_inicial = 0, aux = 0, sal_final;
		
		int cont;
		
		char turno, categoria;
		
		sal_min = 450.0;
		
		for (cont = 1; cont <= 10; cont++) {
			
			System.out.println("Digite o codigo");
			codigo = receba.nextDouble();
			
			System.out.println("Digite as horas trabalhadas por mês");
			nht = receba.nextDouble();
			
			do {
                System.out.println("Digite o turno (M - Matutino, V - Vespertino, N - Noturno):");
                turno = receba.next().toUpperCase().charAt(0);
                
                if (turno != 'M' && turno != 'V' && turno != 'N') {
                    System.out.println("Turno inválido. Tente novamente.");
                }
            } 
			
			while (turno != 'M' && turno != 'V' && turno != 'N');
			
			 do {
	                System.out.println("Digite a categoria (O - Operário, G - Gerente):");
	                categoria = receba.next().toUpperCase().charAt(0);
	                
	                if (categoria != 'G' && categoria != 'O') {
	                     System.out.println("Categoria inválida. Tente novamente.");
	                }
	            } 
			 
			 while (categoria != 'G' && categoria != 'O');
			
			if (categoria == 'G') {
				
				if (turno == 'N') {
					
					valor = sal_min * 0.13;
				}
				
				else {
					
					valor = sal_min * 0.10;
				}
			}
			
			else if (categoria == 'O') {
                if (turno == 'N') {
                    valor = sal_min * 0.13;
                } else {
                    valor = sal_min * 0.10;
                }
            }
			
			sal_inicial = nht * valor;
			
			if (sal_inicial <= 300) {
				
				aux = sal_inicial * 0.20;
			}
			
			else if (sal_inicial < 600) {
				
				aux = sal_inicial * 0.15;
			}
			
			else {
				
				aux = sal_inicial * 0.05;
			}
			
			sal_final = sal_inicial + aux;
			System.out.println("Codigo: " + codigo + " Numero de horas trabalhadas no mês: " + nht + " Valor: " + valor + 
					" Salario Inicial: " + sal_inicial + " Aux: " + aux + " Salario final: " + sal_final);
		}
	}
}
