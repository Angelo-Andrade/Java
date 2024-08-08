package Xadrez;

class Peao extends Peca {
    private boolean firstMove;

    public Peao(int x, int y, int jogador) {
        super(x, y, jogador);
        this.firstMove = true;
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        // Lógica de movimento do peão
        int dy = jogador == 1 ? 1 : -1;
        if (novoX == x && ((novoY == y + dy) || (firstMove && novoY == y + 2 * dy && novoY >= 0 && novoY < 8))) {
            firstMove = false;
            return true;
        }
        if (Math.abs(novoX - x) == 1 && novoY == y + dy) {
            return true; // Captura
        }
        return false;
    }
}
