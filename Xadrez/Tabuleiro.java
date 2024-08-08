package Xadrez;

class Tabuleiro {
    private Peca[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new Peca[8][8];
    }

    public void adicionarPeca(Peca peca, int x, int y) {
        tabuleiro[x][y] = peca;
    }

    public Peca obterPeca(int x, int y) {
        return tabuleiro[x][y];
    }

    public boolean moverPeca(int x, int y, int novoX, int novoY, int jogadorAtual) {
        Peca peca = tabuleiro[x][y];
        if (peca == null || peca.jogador != jogadorAtual) {
            System.out.println("Movimento inválido. Peça do jogador incorreto.");
            return false;
        }

        boolean movimentoValido = peca.mover(novoX, novoY);

        if (movimentoValido) {
            if (!verificarCaminhoLivre(x, y, novoX, novoY, peca)) {
                System.out.println("Movimento inválido. Caminho obstruído.");
                return false;
            }

            Peca destino = tabuleiro[novoX][novoY];
            tabuleiro[novoX][novoY] = peca;
            tabuleiro[x][y] = null;
            peca.atualizarPosicao(novoX, novoY);

            if (estaEmCheque(jogadorAtual)) {
                System.out.println("Movimento inválido. O rei está em cheque.");
                tabuleiro[x][y] = peca;
                tabuleiro[novoX][novoY] = destino;
                peca.atualizarPosicao(x, y);
                return false;
            }
            return true;
        }
        
        return false;
    }

    private boolean verificarCaminhoLivre(int x, int y, int novoX, int novoY, Peca peca) {
        if (peca instanceof Cavalo) {
            return true;
        }

        int dx = Integer.compare(novoX, x);
        int dy = Integer.compare(novoY, y);
        
        int cx = x + dx;
        int cy = y + dy;
        
        while (cx != novoX || cy != novoY) {
            if (tabuleiro[cx][cy] != null) {
                return false;
            }
            cx += dx;
            cy += dy;
        }
        
        return true;
    }

    private boolean estaEmCheque(int jogador) {
        int[] posicaoRei = encontrarRei(jogador);
        if (posicaoRei == null) {
            return false;
        }

        int xRei = posicaoRei[0];
        int yRei = posicaoRei[1];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Peca peca = tabuleiro[i][j];
                if (peca != null && peca.jogador != jogador) {
                    if (peca.mover(xRei, yRei) && verificarCaminhoLivre(i, j, xRei, yRei, peca)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }

    private int[] encontrarRei(int jogador) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Peca peca = tabuleiro[i][j];
                if (peca instanceof Rei && peca.jogador == jogador) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
