package Xadrez;

class Torre extends Peca {
    public Torre(int x, int y, int jogador) {
        super(x, y, jogador);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        return novoX == x || novoY == y;
    }
}