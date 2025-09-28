package br.edu.principal;
import br.edu.util.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número (dividendo): ");
        int num1 = leitor.nextInt();
        System.out.print("Digite o segundo número (divisor): ");
        int num2 = leitor.nextInt();

        int resultado = verificador.verificaDivisor(num1, num2);

        if (resultado == 0) {
            System.out.println("O número " + num1 + " é divisível por " + num2 + ".");
        } else if (resultado == -1) {
            System.out.println("Erro: Divisão por zero não é possível.");
        } else {
            System.out.println(num1 + " não é divisível por " + num2 + ". O próximo número divisível é " + resultado + ".");
        }
	}

}
