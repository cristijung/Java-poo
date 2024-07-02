package funcaoLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FuncaoPura {
    public static int clacularQuadrado(int n) {
        return  n * n;
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //função pura junto com stream API
        List<Integer> quadrados = numeros.stream().map(FuncaoPura::clacularQuadrado).collect(Collectors.toList());

        System.out.println(quadrados);


    }
}
