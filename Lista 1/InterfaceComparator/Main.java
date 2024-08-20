package InterfaceComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Televisão", 1500.0));
        produtos.add(new Produto("Notebook", 3000.0));
        produtos.add(new Produto("Celular", 1200.0));
        produtos.add(new Produto("Tablet", 800.0));
        produtos.add(new Produto("Mouse", 50.0));

        // Ordenando por preço (Comparable)
        Collections.sort(produtos);
        System.out.println("Produtos ordenados por preço:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        // Ordenando por nome (Comparator)
        Collections.sort(produtos, Produto.compararPorNome());
        System.out.println("\nProdutos ordenados por nome:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
