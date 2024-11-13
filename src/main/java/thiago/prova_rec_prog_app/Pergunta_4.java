package thiago.prova_rec_prog_app;

import javax.swing.JOptionPane;

public class Pergunta_4 {
    public static void main(String[] args) {
        int num;
        
        num = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite um número inteiro"));
        JOptionPane.showMessageDialog(null, String.format("O antecessor é %d e o sucessor é %d", num - 1, num + 1));
    }
}
