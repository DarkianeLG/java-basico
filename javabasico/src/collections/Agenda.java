//OPERACAO BASICA COM MAP

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<String, Integer> AgendaContatoMap;

    public Agenda() {
        this.AgendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        AgendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!AgendaContatoMap.isEmpty()) {
            AgendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(AgendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!AgendaContatoMap.isEmpty()) {
            numeroPorNome = AgendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.exibirContatos();
        System.out.println("Telefone de João: " + agenda.pesquisarPorNome("João"));
        agenda.removerContato("João");
        agenda.exibirContatos();
    }
}
