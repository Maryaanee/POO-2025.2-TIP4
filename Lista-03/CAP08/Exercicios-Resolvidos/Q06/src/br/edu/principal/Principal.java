package br.edu.principal;

import java.util.Scanner;

public class Principal {

    
    public static void multiplicacao(int n) {
        
        int i, j;

        for (i = 1; i <= n; i++) {
             
            for (j = 1; j <= i; j++) {
                  
                System.out.printf("%5d", i * j);   
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);

        int num;
 
        do {
            
            System.out.print("Digite um número inteiro entre 1 e 9: ");
            
            if (receba.hasNextInt()) {
                
            	num = receba.nextInt();
            }
            
            else {
                
                System.out.println("Entrada inválida. Por favor, digite um número.");
                receba.next();
                num = 0;
            }
        } 
        
        while (num < 1 || num > 9);
        
        multiplicacao(num);
    }
}