package collections.hashset;

import java.util.HashSet;

public class MainHashSet {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();

        nomes.add("Ana");
        nomes.add("Alice");
        nomes.add("Bia");
        nomes.add("José");

        System.out.println("Nomes no Conjunto: " + nomes);

        nomes.add("Josefo");
        System.out.println("Nomes no conjunto após adição de mais elemento: " + nomes);

        nomes.add("Ana");
        System.out.println("Conjunto após tentar adicionar um nome repetido - no caso Ana: " + nomes);
        //não permite a adição de nomes duplicados pq ele é um CONJUNTO

        boolean contemBia = nomes.contains("Bia");
        System.out.println("O conjunto contém o elemento Bia? " + contemBia);

        //AVISO
        //remover, add e iterar podem ser aplicados de forma igual ao ArrayList

    }
}
