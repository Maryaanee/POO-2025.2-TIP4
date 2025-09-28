package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

        int num_termos, i, j, denominador, expoente, fim;
        double x, fat, s;

        // Leitura dos dados
        System.out.print("Digite o número de termos: ");
        num_termos = entrada.nextInt();
        System.out.print("Digite o valor de X (positivo): ");
        x = entrada.nextDouble();

        s = 0;
        denominador = 1; // Sequência do fatorial

        for (i = 1; i <= num_termos; i++) {
            fim = denominador;
            fat = 1;

            // Calcula o fatorial
            for (j = 1; j <= fim; j++) {
                fat *= j;
            }

            expoente = i + 1;

            // Alterna o sinal conforme o expoente
            if (expoente % 2 == 0) {
                s -= Math.pow(x, expoente) / fat;
            } else {
                s += Math.pow(x, expoente) / fat;
            }

            // Atualiza o denominador da sequência 1,2,3,4,3,2,1,...
            if (denominador == 4) {
                denominador = -1;
            } else if (denominador == 1) {
                denominador = 1;
            }

            if (denominador == 1) {
                denominador++;
            } else if (denominador == -1) {
                denominador--;
            } else {
                denominador++;
            }
        }

        System.out.println("Valor da série: " + s);

	}

}
