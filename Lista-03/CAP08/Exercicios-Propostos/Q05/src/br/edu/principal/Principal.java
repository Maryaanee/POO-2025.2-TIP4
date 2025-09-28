package br.edu.principal;
import br.edu.util.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int numero = leitor.nextInt();

        String resultado = verica.verificaSinal(numero);

        System.out.println("O número " + numero + " é: " + resultado);
	}

}
