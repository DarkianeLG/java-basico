import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

class NumeroInvalidosException extends Exception {
    public NumeroInvalidosException(String message) {
        super(message);
    }
}

public class Contador {

    static void contar(int numeroUm, int numeroDois) throws NumeroInvalidosException {
        if (numeroUm >= numeroDois) {
            throw new NumeroInvalidosException("O segundo numero deve ser maior que o primeiro.");
        } else {
            int contagem = numeroDois - numeroUm;
            for (int k = 1; k <= contagem; k++) {
                System.out.println(k);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Informe o primeiro numero: ");
            int numeroUm = scanner.nextInt();

            System.out.println("Agora informe o segundo numero: ");
            int numeroDois = scanner.nextInt();
            
                contar(numeroUm, numeroDois);

        } catch (NumeroInvalidosException e) {
                System.out.println(e.getMessage());
            }
    }
}
