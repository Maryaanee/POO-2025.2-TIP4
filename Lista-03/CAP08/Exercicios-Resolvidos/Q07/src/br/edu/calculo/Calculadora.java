package br.edu.calculo;

public class Calculadora {
	
	/**
     * Sub-rotina que calcula a média de três notas com base em uma letra.
     * 'A' para média aritmética, 'P' para média ponderada.
     * @param n1 A primeira nota.
     * @param n2 A segunda nota.
     * @param n3 A terceira nota.
     * @param l A letra que define o tipo de média ('A' ou 'P').
     * @return A média calculada.
     */
    public static double calcula_media(double n1, double n2, double n3, char l) {
        // DECLARE media NUMÉRICO
        double media;

        // SE l = “A”
        if (l == 'A') {
            // ENTÃO media ← (n1+n2+n3)/3
            media = (n1 + n2 + n3) / 3;
        } else { // Se não for 'A', o loop no main garante que será 'P'
            // SENÃO media ←(n1*5+n2*3+n3*2)/(5+3+2)
            media = (n1 * 5 + n2 * 3 + n3 * 2) / (5 + 3 + 2);
        }
        // RETORNE media
        return media;
    }
}
    
