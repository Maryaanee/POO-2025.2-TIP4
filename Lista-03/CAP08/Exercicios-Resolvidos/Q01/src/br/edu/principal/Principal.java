package br.edu.principal;

import java.util.Scanner;
import br.edu.verifica.*;

public class Principal {

	public static void main(String[] args) {
	
		        // Declaração de variáveis
		        int num, x;
		        Scanner leitor = new Scanner(System.in);

		        // Leitura do número
		        System.out.print("Digite um número: ");
		        num = leitor.nextInt();

		        // Chama a sub-rotina e armazena o resultado em x
		        x = VerificadorDeNumero.verifica(num);

		        // Verifica o valor retornado pela sub-rotina e imprime a mensagem
		        if (x == 1) {
		            System.out.println("Número positivo");
		        } else {
		            System.out.println("Número negativo");
		        }
		        
	}

}
