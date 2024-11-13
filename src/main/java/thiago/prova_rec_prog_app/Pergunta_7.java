package thiago.prova_rec_prog_app;

import java.util.ArrayList;
import java.util.Scanner;

public class Pergunta_7 {
    public static void main(String[] args) {
        Scanner in;
        Filme filme;
        
        // Defininção do filme e pistas
        System.out.println("Jogador 1, digite seu nome: ");
        in = new Scanner(System.in);
        String nome_p1 = in.nextLine();
        System.out.printf("%s - digite o nome do filme: ", nome_p1);
        filme = new Filme(in.nextLine().trim());
        for (int i = 0; i < Filme.MAX_PISTAS; i++) {
            System.out.printf("%s - digite a pista %d: ", nome_p1, i + 1);
            in = new Scanner(System.in);
            filme.pistas.add(in.nextLine().trim());
        }
        System.out.println("_______________________________________________\n");
        
        // Jogada
        System.out.println("Jogador 2, digite seu nome: ");
        in = new Scanner(System.in);
        String nome_p2 = in.nextLine();
        for (int i = 0; i < Filme.MAX_PISTAS; i++) {
            String pista = filme.pistas.get(i);
            System.out.printf("""
                %s -- a pista %d e: %s
                %s, qual o nome do filme?""" + " ", nome_p2, i+1, pista, nome_p2);
            in = new Scanner(System.in);
            String tentativa = in.nextLine().trim();
            
            if (tentativa.equalsIgnoreCase(filme.nome)) {
                System.out.printf("%s, voce acertou!\n", nome_p2);
                return;
            } else {
                System.out.printf("%s, voce errou!\n", nome_p2);
                if (i == Filme.MAX_PISTAS -1) {
                    System.out.println("Acabaram as pistas... Voce perdeu!\n");
                }
            }
        }
    }
    
    public static class Filme {
        public String nome;
        public static final int MAX_PISTAS = 5;
        public ArrayList<String> pistas;
        
        public Filme(String nome) {
            this.nome = nome;
            this.pistas = new ArrayList<>();
        }
    }
}
