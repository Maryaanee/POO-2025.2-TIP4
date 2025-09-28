package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

        // Laço para os 5 grupos
        for (int grupo = 1; grupo <= 5; grupo++) {
            System.out.println("Digite os 4 valores do grupo" + grupo + ":");
            System.out.println("Valor A:");
            int a = entrada.nextInt();
            System.out.println("Valor B:");
            int b = entrada.nextInt();
            System.out.println("Valor C:");
            int c = entrada.nextInt();
            System.out.println("Valor D:");
            int d = entrada.nextInt();

            // Mostra na ordem lida
            System.out.println("\nGrupo " + grupo + " - Ordem lida: " +
                               a + " " + b + " " + c + " " + d);

            // Ordenação crescente usando repetição
            // 3 passagens (tipo bubble sort para 4 números)
            for (int i = 1; i <= 3; i++) {
                if (a > b) { int tmp = a; a = b; b = tmp; }
                if (b > c) { int tmp = b; b = c; c = tmp; }
                if (c > d) { int tmp = c; c = d; d = tmp; }
            }

            System.out.println("Grupo " + grupo + " - Crescente: " +
                               a + " " + b + " " + c + " " + d);

            System.out.println("Grupo " + grupo + " - Decrescente: " +
                               d + " " + c + " " + b + " " + a);

            System.out.println("-----------------------------");
        }

	}

}
