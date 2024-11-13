package thiago.prova_rec_prog_app;

import java.util.Scanner;

public class Pergunta_2 {
    public static void main(String[] args) {
        int ano, mes, dia;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        ano = in.nextInt();
        System.out.print("Digite o mes: ");
        mes = in.nextInt();
        System.out.print("Digite o dia: ");
        dia = in.nextInt();
        System.out.printf("Sua idade: %d dias\n", ano * 365 + mes * 30 + dia);
    }
}
