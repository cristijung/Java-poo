package collections.streamApi;
//exemplo de stream API

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaColaboradores {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Josefa", "Claudio", "Marcela", "Pafuncio", "Maria", "Ana", "Mafalda");

        List<String> result = list.stream().filter(s -> s.startsWith("M")).map(String::toUpperCase).sorted().collect(Collectors.toList());

        System.out.println(result);

    }
}
