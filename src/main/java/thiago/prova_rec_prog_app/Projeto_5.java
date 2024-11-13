package thiago.prova_rec_prog_app;

import java.util.Scanner;

public class Projeto_5 {
    public static void main(String[] args) {
        Scanner in;
        int cod_usuario, cod_senha;
        cod_usuario = 1234;
        cod_senha = 9999;
        
        System.out.print("Insira o codigo do usuario: ");
        in = new Scanner(System.in);
        int entrada_usuario = in.nextInt();
        
        if (entrada_usuario == cod_usuario) {
            System.out.print("Insira o codigo da senha: ");
            in = new Scanner(System.in);
            int entrada_senha = in.nextInt();
            if (entrada_senha == cod_senha) {
                System.out.println("Acesso permitido!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else {
            System.out.println("Usuario invalido!");
        }
    }
}
