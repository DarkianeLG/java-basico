package apps;

public class NavegadorInternet extends ServicoInstantaneo{

    public void opcao1 (){
        validarConectadoInternet();

        System.out.println("Exibindo pagina");
    }

    public void opcao2 (){
        System.out.println("Adicionando nova aba");
    }

    public void opcao3 (){
        System.out.println("Atualizando pagina");
    }
}