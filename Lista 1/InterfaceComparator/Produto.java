package InterfaceComparator;

import java.util.Comparator;

class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.compare(this.preco, outroProduto.getPreco());
    }
    
    public static Comparator<Produto> compararPorNome() {
        return new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                return p1.getNome().compareTo(p2.getNome());
            }
        };
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
