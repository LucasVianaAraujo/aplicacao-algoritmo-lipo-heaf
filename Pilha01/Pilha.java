package Pilha01;

import javax.swing.JOptionPane;

public class Pilha {
    RegPilha topo = null;

    public void push(Object dado) {
        RegPilha newRegPilha = new RegPilha();
        newRegPilha.dado = dado;
        if (topo == null) {
            newRegPilha.ant = null;
        } else {
            newRegPilha.ant = topo;
        }
        topo = newRegPilha;
    }

    public void pop() {
        if (topo == null)
            return;
        RegPilha temp = topo;
        topo = temp.ant;
        temp = null;
    }

    public void plotar() {
        if (topo == null)
            return;
        String saida = "";
        RegPilha temp = topo;

        while (temp != null) {
            saida += temp.dado + "\n";
            temp = temp.ant;
        }
        JOptionPane.showMessageDialog(null, saida);
    }

    public void destrutor() {
        if (topo == null)
            return;
        topo = topo.ant;
        destrutor();
    }
}