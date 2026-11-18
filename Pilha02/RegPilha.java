package Pilha02;

public class RegPilha {

    private final Media media;
    private final RegPilha proximo;

    public RegPilha(Media media, RegPilha proximo) {
        this.media = media;
        this.proximo = proximo;
    }

    public Media getMedia() {
        return media;
    }

    public RegPilha getProximo() {
        return proximo;
    }
}