import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class SupplierExemplo{

    public static void main(String[] args){

        //Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Ola, seja bem-vindo(a)!";

        //Usar o supplier para obter uma lista com 5 saudação
        List<String> listaSaudacao = Stream.generate(saudacao)
        .limit(maxSize: 3)
        .toList();

        //Imprimir as saudações
        listaSaudacao.forEach(System.out.println);
    }
}