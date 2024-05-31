public class Computador{
    public static void main (String[] args){
        //POLIMORFISMO

        ServicoInstantaneo smi = null;

        /*Não se sabe qual app mas qualquer um deverá enviar e receber mensagem*/
 
    String appEscolhido = "rm";

    if(appEscolhido.equals("rm")){
        smi = new ReprodutorMusical();
    }
    else if(appEscolhido.equals("at")){
        smi = new AparelhoEletronico();
    }
    else if(appEscolhido.equals("ni")){
        smi = new NavegadorInternet();
    }

    smi.enviarMensagem();
    smi.receberMensagem();

    }
}