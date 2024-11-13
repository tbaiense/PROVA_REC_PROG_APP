package thiago.prova_rec_prog_app;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pergunta_8 {
    public static void main(String[] args) throws IOException {
        int num;
        StringBuilder strTabuada = new StringBuilder("### TABUADA ###\n");
        
        System.out.println("Digite o numero para calcular a tabuada: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            strTabuada.append(String.format("%d x %d = %d\n", num, i, num * i));
        }
        
        FileWriter caminhoClasse = new FileWriter("C:\\Users\\Public\\TABUADA.txt");
        PrintWriter impressora = new PrintWriter(caminhoClasse);
        impressora.println(strTabuada.toString());
        caminhoClasse.close();
        impressora.close();
    }
}
