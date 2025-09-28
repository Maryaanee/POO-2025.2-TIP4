package br.edu.principal;
import br.edu.calculo.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double nota1, nota2, nota3, m;
		char letra;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = input.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = input.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = input.nextDouble();
		
        // REPITA ... ATÉ (letra = “A”) OU (letra = “P”)
        do {
            System.out.print("Digite 'A' para Média Aritmética ou 'P' para Média Ponderada: ");
            // Pega o primeiro caractere da entrada e converte para maiúsculo
            letra = input.next().toUpperCase().charAt(0);
        } while (letra != 'A' && letra != 'P');

        // m ← calcula_media(nota1, nota2, nota3, letra)
        m = Calculadora.calcula_media(nota1, nota2, nota3, letra);

        // SE letra = “A”
        if (letra == 'A') {
            // ENTÃO ESCREVA “A média aritmética “ , m
            System.out.printf("A média aritmética é: %.2f\n", m);
        } else {
            // SENÃO ESCREVA “A média ponderada “, m
            System.out.printf("A média ponderada é: %.2f\n", m);
        }


	}

}
