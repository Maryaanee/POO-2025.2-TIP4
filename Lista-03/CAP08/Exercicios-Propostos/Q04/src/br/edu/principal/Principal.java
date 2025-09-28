package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static double calculaVolume(double raio) {
        
        double volume;
         
        volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        
        return volume;
    }

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        
        double r, v;
        
        System.out.print("Digite o valor do raio da esfera: ");
        r = receba.nextDouble();
        
        v = calculaVolume(r);
        
        System.out.printf("\nO volume da esfera (Raio %.2f) é: %.2f\n", r, v);       
    }
}