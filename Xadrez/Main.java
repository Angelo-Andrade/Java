package Xadrez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();

        inicializarTabuleiro(tabuleiro);
        exibirTabuleiro(tabuleiro);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean jogoAtivo = true;
        int jogadorAtual = 1;

        while (jogoAtivo) {
            System.out.println("\nJogador " + jogadorAtual + ", faça seu movimento (ex: 'e2 e4'):");
            try {
                String comando = reader.readLine();
                if (comando.equalsIgnoreCase("sair")) {
                    jogoAtivo = false;
                    System.out.println("Jogo encerrado.");
                    break;
                }

                String[] partes = comando.split(" ");
                if (partes.length != 2) {
                    System.out.println("Comando inválido. Use o formato 'e2 e4'.");
                    continue;
                }

                String posicaoInicial = partes[0];
                String posicaoFinal = partes[1];

                int[] coordsInicial = converterParaCoordenadas(posicaoInicial);
                int[] coordsFinal = converterParaCoordenadas(posicaoFinal);

                if (coordsInicial == null || coordsFinal == null) {
                    System.out.println("Posição inválida.");
                    continue;
                }

                int xInicial = coordsInicial[0];
                int yInicial = coordsInicial[1];
                int xFinal = coordsFinal[0];
                int yFinal = coordsFinal[1];

                boolean movimentoValido = tabuleiro.moverPeca(xInicial, yInicial, xFinal, yFinal, jogadorAtual);

                if (movimentoValido) {
                    exibirTabuleiro(tabuleiro);
                    jogadorAtual = jogadorAtual == 1 ? 2 : 1;
                } else {
                    System.out.println("Movimento inválido.");
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler entrada: " + e.getMessage());
            }
        }
    }

    private static void inicializarTabuleiro(Tabuleiro tabuleiro) {
        for (int i = 0; i < 8; i++) {
            tabuleiro.adicionarPeca(new Peao(i, 1, 1), i, 1);
            tabuleiro.adicionarPeca(new Peao(i, 6, 2), i, 6);
        }

        tabuleiro.adicionarPeca(new Torre(0, 0, 1), 0, 0);
        tabuleiro.adicionarPeca(new Cavalo(1, 0, 1), 1, 0);
        tabuleiro.adicionarPeca(new Bispo(2, 0, 1), 2, 0);
        tabuleiro.adicionarPeca(new Rainha(3, 0, 1), 3, 0);
        tabuleiro.adicionarPeca(new Rei(4, 0, 1), 4, 0);
        tabuleiro.adicionarPeca(new Bispo(5, 0, 1), 5, 0);
        tabuleiro.adicionarPeca(new Cavalo(6, 0, 1), 6, 0);
        tabuleiro.adicionarPeca(new Torre(7, 0, 1), 7, 0);

        tabuleiro.adicionarPeca(new Torre(0, 7, 2), 0, 7);
        tabuleiro.adicionarPeca(new Cavalo(1, 7, 2), 1, 7);
        tabuleiro.adicionarPeca(new Bispo(2, 7, 2), 2, 7);
        tabuleiro.adicionarPeca(new Rainha(3, 7, 2), 3, 7);
        tabuleiro.adicionarPeca(new Rei(4, 7, 2), 4, 7);
        tabuleiro.adicionarPeca(new Bispo(5, 7, 2), 5, 7);
        tabuleiro.adicionarPeca(new Cavalo(6, 7, 2), 6, 7);
        tabuleiro.adicionarPeca(new Torre(7, 7, 2), 7, 7);
    }

    private static int[] converterParaCoordenadas(String posicao) {
        if (posicao.length() != 2) return null;

        char coluna = posicao.charAt(0);
        char linha = posicao.charAt(1);

        int x = coluna - 'a';
        int y = linha - '1';

        if (x < 0 || x > 7 || y < 0 || y > 7) return null;

        return new int[]{x, y};
    }

    private static void exibirTabuleiro(Tabuleiro tabuleiro) {
        System.out.println("\nEstado do tabuleiro:");

        final int larguraColuna = 4;

        System.out.print("   ");
        for (int j = 0; j < 8; j++) {
            System.out.print(String.format("%-" + larguraColuna + "s", (char) ('a' + j)));
        }
        System.out.println();

        for (int i = 7; i >= 0; i--) {
            System.out.print(String.format("%2d ", i + 1));
            for (int j = 0; j < 8; j++) {
                Peca peca = tabuleiro.obterPeca(j, i);
                if (peca != null) {
                    System.out.print(String.format("%-" + larguraColuna + "s", peca.getClass().getSimpleName().charAt(0) + "" + peca.jogador));
                } else {
                    System.out.print(String.format("%-" + larguraColuna + "s", "--"));
                }
            }
            System.out.println();
        }
    }
}
