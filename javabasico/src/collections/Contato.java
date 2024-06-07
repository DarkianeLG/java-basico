//PESQUISA COM SET

import java.util.HashSet;
import java.util.Set;

class ListaContato {
    // Atributos
    private String nome;
    private int contato;

    public ListaContato(String nome, int contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "ListaContato{" +
                "nome='" + nome + '\'' +
                ", contato=" + contato +
                '}';
    }
}

public class Contato {
    private Set<ListaContato> contatoSet;

    public Contato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new ListaContato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<ListaContato> pesquisarPorNome(String nome) {
        Set<ListaContato> contatosPorNome = new HashSet<>();

        for (ListaContato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public ListaContato atualizarNumeroContato(String nome, int novoNumero) {
        ListaContato contatoAtualizado = null;

        for (ListaContato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setContato(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        Contato agenda = new Contato();

        // Adicionar alguns contatos
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("José", 192837465);

        // Exibir todos os contatos
        System.out.println("Lista de contatos:");
        agenda.exibirContato();

        // Pesquisar contatos por nome
        System.out.println("Pesquisar contatos que começam com 'Jo':");
        Set<ListaContato> contatosJo = agenda.pesquisarPorNome("Jo");
        System.out.println(contatosJo);

        // Atualizar número de contato
        System.out.println("Atualizar número de Maria para 555555555:");
        ListaContato contatoAtualizado = agenda.atualizarNumeroContato("Maria", 555555555);
        System.out.println(contatoAtualizado);

        // Exibir todos os contatos após atualização
        System.out.println("Lista de contatos após atualização:");
        agenda.exibirContato();
    }
}
