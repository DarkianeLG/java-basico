package apps;

public class ReprodutorMusical extends ServicoInstantaneo{

    public void opcao1 (){
        validarConectadoInternet();

        System.out.println("Ligando");
    }

    public void opcao2 (){
        System.out.println("Atendendo");
    }

    public void opcao3 (){
        System.out.println("Iniciando correio de voz");
    }
}