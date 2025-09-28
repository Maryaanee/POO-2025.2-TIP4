package br.edu.principal;
import br.edu.soma.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
	        System.out.print("Digite um número inteiro e positivo: ");
	        int numero = leitor.nextInt();

	        int resultado = Soma.somarAteN(numero);

	        if (resultado != -1) {
	            System.out.println("A soma dos números de 1 até " + numero + " é: " + resultado);
	        } else {
	            System.out.println("O número precisa ser positivo.");
	        }

	}

}
