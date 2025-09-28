package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		
		    float vlr_ingresso, lucro;
		    int quant_ingresso;
		    int i;

		    vlr_ingresso = 5;
		    quant_ingresso = 120;

		    System.out.println("FUNÇÃO QUE CALCULA O LUCRO: F(x) = VALOR * QUANTIDADE - 200 \n\n ");

		    System.out.printf("VALOR INGRESSO: R$ %.2f. \n", vlr_ingresso);
		    lucro = quant_ingresso * vlr_ingresso - 200;
		    System.out.printf("    Lucro: R$ %.2f. \n", lucro);

		    for (i = 5; i <= 12; i++) {

		        vlr_ingresso = vlr_ingresso - 50/100;
		        quant_ingresso = quant_ingresso + 26;
		        System.out.printf("VALOR INGRESSO: R$ %.2f. \n", vlr_ingresso);
		        lucro = quant_ingresso * vlr_ingresso - 200;
		        System.out.printf("    Lucro: R$ %.2f. \n", lucro);
		    }
	}

}

