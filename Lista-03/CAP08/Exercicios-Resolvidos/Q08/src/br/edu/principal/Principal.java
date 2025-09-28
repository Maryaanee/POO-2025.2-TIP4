package br.edu.principal;

import java.util.Scanner;

public class Principal {

    
    public static int calculaDuracao(int h_i, int m_i, int h_f, int m_f) {
        
        int tot_h;
        int tot_m;
        int total;

        if (m_f < m_i) {
            // m_f ← m_f + 60
            m_f = m_f + 60;
            // h_f ← h_f - 1
            h_f = h_f - 1;
        }
       
        if (h_f < h_i) {
            // h_f ← h_f + 24
            h_f = h_f + 24;
        }
        
        tot_m = m_f - m_i;
        
        tot_h = h_f - h_i;

        total = tot_h * 60 + tot_m;
        
        return total;
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        int hora_i, min_i, hora_f, min_f, minutos;
             
        System.out.print("Hora de Início (HH MM): ");
        hora_i = scanner.nextInt();
        min_i = scanner.nextInt();
   
        System.out.print("Hora de Término (HH MM): ");
        hora_f = scanner.nextInt();
        min_f = scanner.nextInt();
                
        minutos = calculaDuracao(hora_i, min_i, hora_f, min_f);
        
        System.out.println("A duração total do jogo foi de " + minutos + " minutos.");       
    }
}