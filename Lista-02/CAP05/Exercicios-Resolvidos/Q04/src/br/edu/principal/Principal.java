package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		
		double maior = 0, cid_maior = 0, menor = 0,
		cid_menor = 0, media_vei, soma_vei, media_acid, soma_acid;
		
		int cont, cont_acid = 0, cod, num_vei, num_acid;
		
		soma_vei = 0;
		soma_acid = 0;
		cont_acid = 0;
		
		for (cont = 1; cont <= 5; cont++) {
		
		System.out.println("Digite o código da cidade: ");
		cod = receba.nextInt();
		System.out.println("Digite a quantidade de veículos de passeio no mês: ");
		num_vei = receba.nextInt();
		System.out.println("Digite a quantidade de acidentes de trânsito com vítimas no mês: ");
		num_acid = receba.nextInt();
		
		if (cont == 1) {
			
			maior = num_acid;
			cid_maior = cod;
			menor = num_acid;
			cid_menor = cod;
		}
		else {
			
			if (num_acid > maior) {
				
				maior = num_acid;
				cid_maior = cod;
			}
			
			if (num_acid < menor) {
				
				menor = num_acid;
				cid_menor = cod;
			}
		}
		
		soma_vei = soma_vei + num_vei;
		
		if (num_vei < 2000) {
			
			soma_acid = soma_acid + num_acid;
			cont_acid = cont_acid + 1;
		}
		
		}
		
		System.out.println(
				"\nO maior índice de acidentes de trânsito é " + maior + " da cidade do código " + cid_maior);
		System.out.println(
				"O menor índice de acidentes de trânsito é " + menor + " da cidade do código " + cid_menor);
		
		media_vei = soma_vei/5;
		
		System.out.println("A média de veiculos nas 5 cidades é: " + media_vei);
		
		if (cont_acid == 0) {
			
			System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos");
		}
		
		else {
			
			media_acid = soma_acid/cont_acid;
			System.out.println("A média de acidentes é: " + media_acid);
		
		}
		
	}
	
}
