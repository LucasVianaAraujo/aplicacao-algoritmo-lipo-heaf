package Pilha02;

import javax.swing.JOptionPane;

public class PilhaHeap {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        boolean executando = true;

        while (executando) {
            String opcao = JOptionPane.showInputDialog(
                    null,
                    "1 - Push\n2 - Pop\n5 - Sair",
                    "MENU PILHA HEAP",
                    JOptionPane.QUESTION_MESSAGE);

            if (opcao == null) {
                break;
            }

            switch (opcao.trim()) {
                case "1":
                    empilhar(pilha);
                    break;
                case "2":
                    desempilhar(pilha);
                    break;
                case "5":
                    executando = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    private static void empilhar(Pilha pilha) {
        String nome = JOptionPane.showInputDialog(null, "Nome do aluno:");
        if (nome == null) {
            return;
        }

        String textoNota1 = JOptionPane.showInputDialog(null, "Digite a primeira nota:");
        if (textoNota1 == null) {
            return;
        }

        String textoNota2 = JOptionPane.showInputDialog(null, "Digite a segunda nota:");
        if (textoNota2 == null) {
            return;
        }

        double nota1 = Double.parseDouble(textoNota1);
        double nota2 = Double.parseDouble(textoNota2);
        Media media = new Media(nome, nota1, nota2);
        pilha.push(media);
        JOptionPane.showMessageDialog(null, "Aluno empilhado\nMédia: " + media.getMedia());
    }

    private static void desempilhar(Pilha pilha) {
        Media media = pilha.pop();
        if (media == null) {
            JOptionPane.showMessageDialog(null, "Pilha vazia");
            return;
        }

        JOptionPane.showMessageDialog(
                null,
                "Aluno removido:\n"
                        + "Nome: " + media.getNome() + "\n"
                        + "Nota 1: " + media.getNota1() + "\n"
                        + "Nota 2: " + media.getNota2() + "\n"
                        + "Média: " + media.getMedia());
    }
}