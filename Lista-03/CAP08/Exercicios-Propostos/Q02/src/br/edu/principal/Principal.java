package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static int converteParaSegundos(int horas, int minutos, int segundos) {
        
        int total_seg;       
        
        total_seg = (horas * 3600) + (minutos * 60) + segundos;
           
        return total_seg;
    }

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        
        int h, m, s, total;
                
        System.out.print("Digite as Horas: ");
        h = receba.nextInt();
        
        System.out.print("Digite os Minutos: ");
        m = receba.nextInt();
        
        System.out.print("Digite os Segundos: ");
        s = receba.nextInt();
        
        total = converteParaSegundos(h, m, s);
        
        System.out.println("\nO total em segundos é: " + total + "s.");        
    }
}