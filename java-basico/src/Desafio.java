import java.util.Scanner;
import java.util.Locale;

public class Desafio{
    public static void main (String[] args) {
        
        Scanner leitorDeEntrada = new Scanner (System.in).useLocale(Locale.US);

        System.out.println ("Informe o valor do seu salario: ");
        float valorSalario = leitorDeEntrada.nextFloat();

        System.out.println ("Agora, informe o valor dos beneficios: ");
        float valorBeneficio = leitorDeEntrada.nextFloat();

        float valorImposto = 0;

        if(valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = 0.5F * valorSalario;
        }

        if(valorSalario >= 1100.01 && valorSalario <= 2500){
            valorImposto = 0.10F * valorSalario;
        }

        else{
            valorImposto = 0.15F * valorSalario;
        }

        float saida = (valorSalario - valorImposto) + valorBeneficio;

        System.out.println ("O valor transferido sera " +  saida);

    }
}