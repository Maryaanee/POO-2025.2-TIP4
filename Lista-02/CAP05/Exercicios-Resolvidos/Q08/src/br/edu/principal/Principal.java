package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);

        int num_termos, i = 1;
        long num1, num2, num3; 

        System.out.println("Digite o numero de termos:");
        num_termos = receba.nextInt();

        num1 = 2;
        num2 = 7;
        num3 = 3;

        System.out.println("A série com " + num_termos + " termos é: ");

        while (i <= num_termos) {
            
            if (i % 3 == 1) {
            	
                System.out.print(num1 + "  ");
                num1 = num1 * 2;
            } 
            else if (i % 3 == 2) {
            	
                System.out.print(num2 + "  ");
                num2 = num2 * 3;
            } 
            else {
            	
                System.out.print(num3 + "  ");
                num3 = num3 * 4;
            }

            i++;
        }
    }
}