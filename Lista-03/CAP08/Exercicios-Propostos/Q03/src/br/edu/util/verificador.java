package br.edu.util;

public class verificador {
	/**
     * Sub-rotina que verifica a divisibilidade.
     * @param a O primeiro número (dividendo).
     * @param b O segundo número (divisor).
     * @return 0 se 'a' for divisível por 'b'. Caso contrário, retorna o
     * menor número maior que 'a' que é divisível por 'b'.
     */
    public static int verificaDivisor(int a, int b) {
        if (b == 0) {
            return -1; // Divisão por zero não é permitida
        }

        if (a % b == 0) {
            return 0;
        } else {
            // Calcula o próximo múltiplo de 'b' depois de 'a'
            int proximoDivisor = a + (b - (a % b));
            return proximoDivisor;
        }
    }
}
