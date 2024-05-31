//Abstração
package apps;

public abstract class ServicoInstantaneo{

    public abstract void opcao1();
    public abstract void opcao2();
    public abstract void opcao3();

    //Somente os filhos conhecem este método.

    protected void validarConectadoInternet (){
        System.out.println("Validando se está conectado a internet");
    }
}