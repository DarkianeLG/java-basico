import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;



public class AboutMe{

    public static void main (String[] ags){
    try{
        //Criando scanner
    Scanner scanner = new Scanner(System.in).useLocale (Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
       
         //Imprimindo os dados do usuário
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura eh " + altura + " cm");

    scanner.close();
    }
    catch ( InputMismatchException e){
        System.out.println("Os campos idade e altura precisam ser numericos");
    }
    }
}