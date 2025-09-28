package br.edu.soma;

public class Soma {

	public static int somarAteN(int n) {
        if (n < 1) {
            return -1; // Retorna um valor de erro se N não for positivo
        }

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
	}
}
