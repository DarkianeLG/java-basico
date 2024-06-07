import java.util.Arrays;
import java.util.List;


public class Consumer{

    public static void main(String[] args){
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Usar o Consumer para imprimir números pares no Stream
        numeros.forEach(n -> {
            if (n%2 == 0){
                System.out.println(n);
            }
        }
        );

        
    }
}