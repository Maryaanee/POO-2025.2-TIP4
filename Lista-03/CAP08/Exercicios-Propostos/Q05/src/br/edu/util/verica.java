package br.edu.util;

public class verica {
	public static String verificaSinal(int valor) {
        if (valor > 0) {
            return "Positivo";
        } else if (valor < 0) {
            return "Negativo";
        } else {
            return "Zero";
        }
	}
}
