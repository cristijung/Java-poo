package collections.treeset;

import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(2);
        numeros.add(12);
        numeros.add(23);
        numeros.add(9);

        System.out.println("Números do conjunto: " + numeros);

        numeros.remove(23);
        System.out.println("Após remoção de elemento: " + numeros);

        System.out.println("Interando");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        //procurando um número específico
        boolean contemNum = numeros.contains(9);
        System.out.println("O registro contém um número 9? " + contemNum);
    }
}
