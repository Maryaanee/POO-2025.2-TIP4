package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		
		int cont_time, cont_jog, idade, qtde = 0, media_idade;
		float peso, alt, media_altura = 0, porc, tot80 = 0;
		
		for (cont_time = 1; cont_time <= 5; cont_time++) {
			
			media_idade = 0;
			
			for (cont_jog = 1; cont_jog <= 11; cont_jog++) {
				
				System.out.println("Digite a idade: ");
				idade = receba.nextInt();
				
				System.out.println("Digite o peso: ");
				peso = receba.nextFloat();
				
				System.out.println("Digite a altura: ");
				alt = receba.nextFloat();
				
				if (idade < 18) {
					
					qtde = qtde + 1;
					media_idade = media_idade + idade;
					media_altura = media_altura + alt;
				}
				
				if (peso > 80) {
					
					tot80 = tot80 + 1;
				}
				
			}
			
			media_idade = media_idade/11;
			System.out.println(media_idade);
			
		}
		
		System.out.println(qtde);
		
		media_altura = media_altura/55;
		
		System.out.println(media_altura);
		
		porc = tot80 * 100/55;
		
		System.out.println(porc);
		
	}

}
