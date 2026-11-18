package Pilha01;

import javax.swing.JOptionPane;

public class PilhaHeap {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        int opcao = 0;

        while (opcao != 5) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "=== MENU PILHA HEAP ===\n" +
                            "1 - Push (Empilhar)\n" +
                            "2 - Pop (Desempilhar)\n" +
                            "3 - Plotar (Mostrar)\n" +
                            "4 - Destruir\n" +
                            "5 - Sair"));

            if (opcao == 1) {
                String nome = JOptionPane.showInputDialog("Digite um nome:");
                pilha.push(nome);
            } else if (opcao == 2) {
                pilha.pop();
            } else if (opcao == 3) {
                pilha.plotar();
            } else if (opcao == 4) {
                pilha.destrutor();
                JOptionPane.showMessageDialog(null, "Pilha destruída!");
            }
        }
    }
}