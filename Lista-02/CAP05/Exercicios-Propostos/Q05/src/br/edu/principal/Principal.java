package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		
		 // O primeiro loop (i) percorre os números de 1 a 10 (o número da tabuada)
        for (int i = 1; i <= 10; i++) {
            System.out.println("--- Tabuada do " + i + " ---");

            // O segundo loop (j) percorre os multiplicadores de 1 a 10
            for (int j = 1; j <= 10; j++) {
                // Calcula e imprime o resultado
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Adiciona uma linha em branco para separar as tabuadas
        }
	}

}
