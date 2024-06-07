//OPERACAO BASICA COM SET

import java.util.HashSet;
import java.util.Set;

class Convidado {
    // Atributos
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}

public class ConjuntoConvidados {
    // Atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        // Criar uma instância de ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // Adicionar alguns convidados
        conjuntoConvidados.adicionarConvidado("João", 1);
        conjuntoConvidados.adicionarConvidado("Maria", 2);
        conjuntoConvidados.adicionarConvidado("José", 3);

        // Exibir a lista de convidados
        System.out.println("Lista de convidados:");
        conjuntoConvidados.exibirConvidados();

        // Contar o número de convidados
        System.out.println("Número de convidados:");
        System.out.println(conjuntoConvidados.contarConvidados());

        // Remover um convidado pelo código do convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(2);

        // Exibir a lista de convidados após a remoção
        System.out.println("Lista de convidados após a remoção:");
        conjuntoConvidados.exibirConvidados();

        // Contar o número de convidados após a remoção
        System.out.println("Número de convidados após a remoção:");
        System.out.println(conjuntoConvidados.contarConvidados());
    }

}
