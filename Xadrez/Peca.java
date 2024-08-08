package Xadrez;

abstract class Peca {
    protected int x, y, jogador;

    public Peca(int x, int y, int jogador) {
        this.x = x;
        this.y = y;
        this.jogador = jogador;
    }

    public abstract boolean mover(int novoX, int novoY);

    public void atualizarPosicao(int novoX, int novoY) {
        this.x = novoX;
        this.y = novoY;
    }
}
