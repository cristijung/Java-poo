package collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MainHasMap {
    public static void main(String[] args) {
        HashMap<String, Integer> idadePorNome = new HashMap<>();

        //ass elementos na tabela
        idadePorNome.put("Ana", 30);
        idadePorNome.put("Bob", 25);
        idadePorNome.put("Alice", 35);

        System.out.println("Nomes e idades na tabela: " + idadePorNome);

        //add um elemento com chave já existente
        idadePorNome.put("Alice", 25);
        System.out.println("Dado atualizou" + idadePorNome);

        //iterando sobre elementos do hashmap
        System.out.println("Iterando sobre os nomes e idades:");
        for (Map.Entry<String, Integer> entrada : idadePorNome.entrySet()) {
            System.out.println("Nome: " + entrada.getKey() + ", idade: " + entrada.getValue());
        }

        //verificar se o mapa contém uma chave específica
        boolean contemAna = idadePorNome.containsKey("Ana");
        System.out.println("O mapa contém um registro Ana? " + contemAna);


    }
}
