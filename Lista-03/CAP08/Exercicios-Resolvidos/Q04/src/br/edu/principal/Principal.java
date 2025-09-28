package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void transformacao(int segundos) {
       
        int h, m, s, r;

        h = segundos / 3600;
        
        r = segundos % 3600;
        
        m = r / 60;
        
        s = r % 60;

        System.out.println("Conversão: " + h + "h, " + m + "m e " + s + "s.");
    }

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
         
        int seg;

        System.out.println("--- Conversor de Segundos para H:M:S ---");
        
        System.out.print("Digite o valor em segundos: ");
        seg = receba.nextInt();
        
        transformacao(seg);
        
    }
}