import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(this.idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}

public class Ordenacao {
    private List<Pessoa> pessoaList;

    public Ordenacao() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();
        ordenacao.adicionarPessoa("Ana", 25, 1.70);
        ordenacao.adicionarPessoa("Bruno", 22, 1.80);
        ordenacao.adicionarPessoa("Carlos", 30, 1.75);

        System.out.println("Ordenado por idade:");
        for (Pessoa p : ordenacao.ordenadoPorIdade()) {
            System.out.println(p);
        }

        System.out.println("Ordenado por altura:");
        for (Pessoa p : ordenacao.ordenarPorAltura()) {
            System.out.println(p);
        }
    }
}
