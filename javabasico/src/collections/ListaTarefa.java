import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributo
    private List<String> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(descricao);
    }

    public void removerTarefa(String descricao) {
        List<String> tarefasParaRemover = new ArrayList<>();

        for (String t : tarefaList) {
            if (t.equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefa() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        for (String tarefa : tarefaList) {
            System.out.println(tarefa);
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Fazer exercícios");

        System.out.println("Descrições das tarefas:");
        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Estudar Java");

        System.out.println("Descrições das tarefas após remoção:");
        listaTarefa.obterDescricoesTarefas();

        System.out.println("O número total de elementos na lista após remoção é: " + listaTarefa.obterNumeroTotalTarefa());
    }
}
