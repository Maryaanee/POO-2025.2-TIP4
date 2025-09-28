package br.edu.somaDiv;

public class somaDiv {

	    /**
	     * Sub-rotina que soma todos os números inteiros entre b e c (inclusive)
	     * que são divisíveis por a.
	     * @param a O divisor (deve ser maior que 1).
	     * @param b O início do intervalo.
	     * @param c O fim do intervalo.
	     * @return A soma dos números no intervalo que são divisíveis por a.
	     */
	    public static int divisores(int a, int b, int c) {
	        // Declara e inicializa a variável da soma
	        int s = 0;

	        // Garante que o loop funcione corretamente se b for maior que c
	        int inicio = Math.min(b, c);
	        int fim = Math.max(b, c);

	        // PARA i ← b ATÉ c FAÇA
	        for (int i = inicio; i <= fim; i++) {
	            // r ← RESTO (i / a)
	            // SE r = 0
	            if (i % a == 0) {
	                // ENTÃO s ← s + i
	                s = s + i;
	            }
	        }
	        // RETORNE s
	        return s;
	    }
	}

