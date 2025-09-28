package br.edu.principal;

import java.util.Scanner;
import br.edu.somaDiv.*;

public class Principal {

	public static void main(String[] args) {
	
		        // DECLARE a, b, c, result NUMÉRICO
		        int a, b, c, result;
		        Scanner leitor = new Scanner(System.in);

		        // REPITA ... ATÉ a > 1
		        do {
		            System.out.print("Digite o valor de 'a' (deve ser maior que 1): ");
		            a = leitor.nextInt();
		        } while (a <= 1);

		        // LEIA b,c
		        System.out.print("Digite o valor de 'b' (início do intervalo): ");
		        b = leitor.nextInt();
		        System.out.print("Digite o valor de 'c' (fim do intervalo): ");
		        c = leitor.nextInt();

		        // result ← divisores(a, b, c)
		        result = somaDiv.divisores(a, b, c);

		        // ESCREVA “Soma dos inteiros = “, result
		        System.out.println("A soma dos inteiros divisíveis por " + a + " entre " + b + " e " + c + " é: " + result);

		       
		    }
		}

	


