//ORDENACAO COM MAP
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class AgendaEventos {
    // Atributos
    private String nome;
    private LocalDate data;
    private String atracao;

    public AgendaEventos(String nome, LocalDate data, String atracao) {
        this.nome = nome;
        this.data = data;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "AgendaEventos{" +
                "nome='" + nome + '\'' +
                ", data=" + data +
                ", atracao=" + atracao +
                '}';
    }
}

public class Eventos {
    private Map<LocalDate, AgendaEventos> eventosMap;

    public Eventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new AgendaEventos(nome, data, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, AgendaEventos> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        AgendaEventos proximoAgendaEventos = null;

        Map<LocalDate, AgendaEventos> eventosTreeMap = new TreeMap<>(eventosMap);

        for (Map.Entry<LocalDate, AgendaEventos> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoAgendaEventos = entry.getValue();
                System.out.println("O próximo evento " + proximoAgendaEventos + " acontecerá na data " + proximaData);
                break;
            }
        }

        if (proximaData == null) {
            System.out.println("Não há eventos futuros.");
        }
    }

    public static void main(String[] args) {
        Eventos eventos = new Eventos();
        eventos.adicionarEvento(LocalDate.of(2024, 6, 15), "Festa Junina", "Quadrilha");
        eventos.adicionarEvento(LocalDate.of(2024, 7, 20), "Show de Rock", "Banda XYZ");
        
        eventos.exibirAgenda();
        eventos.obterProximoEvento();
    }
}
