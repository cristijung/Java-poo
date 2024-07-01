package collections.treemap;

import java.util.TreeMap;
import java.util.Map;

public class MainTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> precoDeFruta = new TreeMap<>();

        precoDeFruta.put("Maçã", 1.99);
        precoDeFruta.put("Banana", 4.50);
        precoDeFruta.put("Laranja", 4.89);
        precoDeFruta.put("Bergamota", 1.88);

        System.out.println("Frutas e preços no mapa: " + precoDeFruta);

        precoDeFruta.remove("Maçã");
        System.out.println(precoDeFruta);

        //iterando
        System.out.println("Iterando");
        for (Map.Entry<String, Double> entrada : precoDeFruta.entrySet()) {
            System.out.println("Fruta: " + entrada.getKey() + ", preço: " + entrada.getValue());
        }

        //verificar, buscar um valor
        boolean buscarValor = precoDeFruta.containsValue(4.89);
        System.out.println("O valor registrado procurado: " + buscarValor);
    }

}
