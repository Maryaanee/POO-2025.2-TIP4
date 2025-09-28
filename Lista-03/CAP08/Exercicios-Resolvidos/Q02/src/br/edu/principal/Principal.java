package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
       
        int num1, num2, s;
        
        System.out.print("Digite o primeiro número (num1): ");
        num1 = receba.nextInt();
        
        System.out.print("Digite o segundo número (num2, maior que num1): ");
        num2 = receba.nextInt();
       
        s = somar(num1, num2);
       
        System.out.println("A soma dos inteiros entre " + num1 + " e " + num2 + " é: " + s);
    }
    
    public static int somar(int num1, int num2) {
        
    	int s = 0;         
        
    	for (int i = num1 + 1; i < num2; i++) {
           
            s = s + i;
        }
        
        return s;
    }

}