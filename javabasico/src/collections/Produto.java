//PESQUISA COM MAP

import java.util.HashMap;
import java.util.Map;

class Estoque {
    // Atributos
    private String nome;
    private double preco;
    private int quantidade;

    public Estoque(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

public class Produto {
    // Atributo
    private Map<Long, Estoque> estoqueProdutosMap;

    public Produto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(Long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Estoque(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Estoque e : estoqueProdutosMap.values()) {
                valorTotalEstoque += e.getQuantidade() * e.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Estoque obterProdutoMaisCaro() {
        Estoque produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Estoque e : estoqueProdutosMap.values()) {
                if (e.getPreco() > maiorPreco) {
                    maiorPreco = e.getPreco();
                    produtoMaisCaro = e;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.adicionarProdutos(1L, "Produto A", 10.0, 5);
        produto.adicionarProdutos(2L, "Produto B", 20.0, 3);
        produto.exibirProdutos();
        System.out.println("Valor total do estoque: " + produto.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + produto.obterProdutoMaisCaro());
    }
}
