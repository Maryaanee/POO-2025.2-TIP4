package br.edu.principal;
import br.edu.calculo.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double precoantigo, precoatual, acrescimo;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o preço antigo: ");
		precoantigo = input.nextDouble();
		System.out.println("Digite o preço atual: ");
		precoatual = input.nextDouble();
	    acrescimo = calculo_reajuste.calculo_reajuste(precoantigo, precoatual);
	    		System.out.print("O acréscimo é: " + acrescimo + "%");
	}

}
