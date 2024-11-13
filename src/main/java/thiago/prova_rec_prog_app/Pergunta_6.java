package thiago.prova_rec_prog_app;

import java.util.Scanner;

/**
 *
 * @author t.baiense
 */
public class Pergunta_6 {
    public static void main(String[] args) {
        int N, inseridos, soma = 0;
        double media;
        Scanner in;
        
        System.out.println("Quantos numeros serao inseridos: ");
        in = new Scanner(System.in);
        N = in.nextInt();
        int[] num = new int[N];
        
        for (inseridos = 0; inseridos < N; inseridos++) {
            System.out.println("Insira o numero " + (inseridos + 1) + ": ");
            in = new Scanner(System.in);
            soma += in.nextInt();
        }
        System.out.println("Insercao finalizada!");
        media = ((double)soma) / inseridos;
        
        System.out.printf("""
                          ### RESULTADO ###
                           Valores digitados: %d
                           Media: %1.2f
                           Soma: %d
                           """, inseridos, media, soma);
    }
}
