package thiago.prova_rec_prog_app;

import java.util.Scanner;

public class Pergunta_3 {
    
    static Cafe[] cafesDisponiveis = new Cafe[] {
        new Cafe("Cafe expresso" , 0.75),
        new Cafe("Cafe capuccino" , 1.0),
        new Cafe("Leite com cafe", 1.25)
    };
    
    static int TOTALIZAR = cafesDisponiveis.length + 1;
    
    static int[] qntVendidos = new int[cafesDisponiveis.length];
    
    public static void main(String[] args) {
        String strCafes;
        StringBuilder builderCafes = new StringBuilder();
        int i = 1;
        for (Cafe c : cafesDisponiveis) {
            builderCafes.append(i++);
            builderCafes.append(" - ");
            builderCafes.append(c.toString()); 
            builderCafes.append("\n");
        }
        strCafes = builderCafes.toString();
        
        // Receber cafés
        int escolha = 0;
        Scanner in;
        do {
            System.out.printf("""
                              ####### ESCOLHA UM CAFE #######
                              %s
                              %d - TOTALIZAR VENDAS
                              """, strCafes, TOTALIZAR);
            in = new Scanner(System.in);
            escolha = in.nextInt();
            if (escolha > TOTALIZAR || escolha < 1) {
                System.out.println("Escolha inválida! Tente novamente...\n");
            } else if (escolha != TOTALIZAR) {
                qntVendidos[escolha-1]++;
                System.out.println("Cafe escolhido com sucesso!\n");
            }
        } while (escolha != TOTALIZAR);
        
        // Totalizar vendas
        StringBuilder builderTotal = new StringBuilder();
        int qtdTotal = 0;
        double soma=0;
        int j = 0;
        for (Cafe c : cafesDisponiveis) {
            double somaCafe = qntVendidos[j] * c.preco;
            builderTotal.append(String.format("%s - %d vendidos, totalizando R$ %1.2f\n", c, qntVendidos[j], somaCafe));
            qtdTotal += qntVendidos[j];
            soma += somaCafe;
            j++;
        }
        builderTotal.append(String.format("\nAo total %d cafes foram vendidos, totalizando R$ %1.2f", qtdTotal, soma));
        System.out.printf("""
                          ####### RELATORIO DE VENDAS #######
                          %s
                          """, builderTotal.toString());
        
    }
    
    public static class Cafe {
        public String nome;
        public double preco;
        
        public Cafe(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
        
        @Override
        public String toString() {
            return String.format("%s (R$ %1.2f)", this.nome, this.preco);
        }
    }
}

