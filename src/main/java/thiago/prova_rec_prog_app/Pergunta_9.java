package thiago.prova_rec_prog_app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Pergunta_9 {
    public static void main(String[] args) throws IOException {
        String strLutador, nomeLutador, categoriaLutador;
        double pesoLutador;
        System.out.println("Nome do lutador: ");
        Scanner in = new Scanner(System.in);
        nomeLutador = in.nextLine();
      
        System.out.println("Peso do lutador: ");
        in = new Scanner(System.in);
        pesoLutador = in.nextDouble();
        
        if (pesoLutador >= 100) {
            categoriaLutador = "Pesado";
        } else if (pesoLutador >= 93) {
            categoriaLutador = "Meio pesado";
        } else if (pesoLutador >= 86) {
            categoriaLutador = "Medio";
        } else if (pesoLutador >= 79) {
            categoriaLutador = "Meio medio";
        } else if (pesoLutador >= 72) {
            categoriaLutador = "Ligeiro";
        } else if (pesoLutador >= 65) {
            categoriaLutador = "Leve";
        } else {
            categoriaLutador = "Pena";
        }
        
        strLutador = String.format("""
                                   O lutador %s pesa %1.1f KG e se enquadra na categoria %s
                                   """, nomeLutador, pesoLutador, categoriaLutador);
        
        System.out.printf("Saida escrita no TXT:\n%s", strLutador);
        
        FileWriter caminhoClasse = new FileWriter("C:\\Users\\Public\\LUTADOR.txt");
        PrintWriter impressora = new PrintWriter(caminhoClasse);
        impressora.println(strLutador);
        caminhoClasse.close();
        impressora.close();
    }
}
