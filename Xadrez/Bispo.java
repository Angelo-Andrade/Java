package Xadrez;

class Bispo extends Peca {
    public Bispo(int x, int y, int jogador) {
        super(x, y, jogador);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        return Math.abs(novoX - x) == Math.abs(novoY - y);
    }
}