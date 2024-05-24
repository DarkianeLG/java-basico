import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


public class ProcessoSeletivo{

    public void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO.");
        }

        else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CADIDATO COM CONTRA PROPOSTA.");
        }

        else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }

    static void selecaoCandidatos (){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos [candidatoAtual];
            double salarioPretendido = valorPretendido ();

            if (salarioBase >= salarioPretendido){
                System.out.println ("O candidato " + candidato + " foi selecionado para a vaga.");
                entrandoEmContato(candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido (){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando)
            tentativasRealizadas++;

            else 
            System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");

        else
        System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    
    public static void main(String[] args) {
        ProcessoSeletivo ps = new ProcessoSeletivo();
        //ps.analisarCandidato(1900.0);
        //ps.analisarCandidato(2000.0);
        //ps.analisarCandidato(2200.0);

        selecaoCandidatos ();   
    }
}