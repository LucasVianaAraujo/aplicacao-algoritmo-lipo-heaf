package Pilha02;

public class Pilha {
    private RegPilha topo;

    public void push(Media media) {
        topo = new RegPilha(media, topo);
    }

    public Media pop() {
        if (topo == null) {
            return null;
        }

        Media media = topo.getMedia();
        topo = topo.getProximo();
        return media;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    
    public String plotar() {
        if (topo == null) {
            return null;
        }

        String texto = "";
        RegPilha aux = topo;

        while (aux != null) {
            texto += aux.getMedia().toString() + "\n\n";
            aux = aux.getProximo();
        }

        return texto;
    }

    public void destruir() {
    topo = null;
}

}