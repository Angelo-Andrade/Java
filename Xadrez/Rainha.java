package Xadrez;

class Rainha extends Peca {
    public Rainha(int x, int y, int jogador) {
        super(x, y, jogador);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        return novoX == x || novoY == y || Math.abs(novoX - x) == Math.abs(novoY - y);
    }
}
