package apps;

public class AparelhoEletronico extends ServicoInstantaneo{

    public void opcao1 (){
        validarConectadoInternet();

        System.out.println("Tocando musica");
    }

    public void opcao2 (){
        System.out.println("Pausando musica");
    }

    public void opcao3 (){
        System.out.println("Selecionando musica");
    }
}