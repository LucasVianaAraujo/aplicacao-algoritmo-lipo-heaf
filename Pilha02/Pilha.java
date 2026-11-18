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
}