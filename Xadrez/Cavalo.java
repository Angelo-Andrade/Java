package Xadrez;

class Cavalo extends Peca {
    public Cavalo(int x, int y, int jogador) {
        super(x, y, jogador);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        return (Math.abs(novoX - x) == 2 && Math.abs(novoY - y) == 1) || (Math.abs(novoX - x) == 1 && Math.abs(novoY - y) == 2);
    }
}