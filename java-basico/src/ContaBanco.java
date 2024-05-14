import java.util.Scanner;
import java.util.Locale;

public class ContaBanco {

    public static void main (String [] args) {
        //criando projeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o numero da sua Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Para finalizar, informe deu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola, " + nome +", obrigado por criar uma conta no nosso banco, sua a agencia eh " + agencia +", sua conta eh " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.");

     scanner.close();
    }
}
