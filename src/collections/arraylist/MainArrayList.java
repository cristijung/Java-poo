package collections.arraylist;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        //adicionando os elementos no ArrayList
        nomes.add("Alice");
        nomes.add("Ana Banana");
        nomes.add("Pafúncio");

        System.out.println("Nomes da lista: " + nomes);
        //add um nome em uma posição específica
        nomes.add(1, "Esmeraldo");
        System.out.println("Adicionado mais um nome! " + nomes);

        //removendo
        nomes.remove("Alice");
        System.out.println("Removendo mais um nome! " + nomes);

        //iterando sobre elementos do ArrayList
        System.out.println("Iterando sobre nomes: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        //pegando o tamanho da litas
        int tamanho = nomes.size();
        System.out.println("Tamanho da Lista: " + nomes);

        //limpando lista
        nomes.clear();
        System.out.println("Depois de limpar a lista: " + nomes);
    }

}
