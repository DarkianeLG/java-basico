//ORDENACAO COM SET

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

class CadastroProduto implements Comparable<CadastroProduto> {
    // Atributos
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public CadastroProduto(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(CadastroProduto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "CadastroProduto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

class ComparatorPorPreco implements Comparator<CadastroProduto> {
    @Override
    public int compare(CadastroProduto p1, CadastroProduto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}

public class Cadastro {
    private Set<CadastroProduto> produtoSet;

    public Cadastro() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new CadastroProduto(nome, codigo, preco, quantidade));
    }

    public Set<CadastroProduto> exibirProdutosPorNome() {
        return new TreeSet<>(produtoSet);
    }

    public Set<CadastroProduto> exibirProdutosPorPreco() {
        Set<CadastroProduto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        // Adicionar alguns produtos
        cadastro.adicionarProduto("Produto A", 123456789L, 10.50, 100);
        cadastro.adicionarProduto("Produto B", 987654321L, 20.75, 200);
        cadastro.adicionarProduto("Produto C", 192837465L, 15.30, 150);

        // Exibir produtos ordenados por nome
        System.out.println("Produtos ordenados por nome:");
        Set<CadastroProduto> produtosPorNome = cadastro.exibirProdutosPorNome();
        for (CadastroProduto produto : produtosPorNome) {
            System.out.println(produto);
        }

        // Exibir produtos ordenados por preço
        System.out.println("Produtos ordenados por preço:");
        Set<CadastroProduto> produtosPorPreco = cadastro.exibirProdutosPorPreco();
        for (CadastroProduto produto : produtosPorPreco) {
            System.out.println(produto);
        }
    }
}
