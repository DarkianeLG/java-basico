import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExemplo{

    public static void main(String[] args){
        //Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javaScript", "c");

        //Criar um predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //Usar o Stream para filtrar as palavras com mais de 5 caractereres e, em sequida, imprimir cada palavra que passou no filtro
        palavras.stream()
        .filter(maisDeCincoCaracteres)
        .forEach(System.out::println);

    }
}