package br.edu.verifica;

public class VerificadorDeNumero {

	/**
     * Sub-rotina que verifica se um número é positivo ou negativo.
     * @param num O número a ser verificado.
     * @return 1 se o número for positivo ou zero, 0 se for negativo.
     */
    public static int verifica(int num) {
        int res; // Declara a variável de resultado
        if (num >= 0) {
            res = 1; // Atribui 1 se o número for maior ou igual a zero
        } else {
            res = 0; // Atribui 0 se o número for negativo
        }
        return res; // Retorna o resultado
    }
}
