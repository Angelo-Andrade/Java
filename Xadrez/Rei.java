package Xadrez;

class Rei extends Peca {
    public Rei(int x, int y, int jogador) {
        super(x, y, jogador);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        return Math.abs(novoX - x) <= 1 && Math.abs(novoY - y) <= 1;
    }
}