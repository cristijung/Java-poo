package funcaoLambda.lambda;
//exemplo com interface funcional

@FunctionalInterface
interface Operacao {
    int executar(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        Operacao soma = (a, b) -> a + b; //expressão lambda
        Operacao multi = (a, b) -> a * b; //expressão lambda

        System.out.println("Soma: " + soma.executar(14, 8));
        System.out.println("A multiplicação é: " + multi.executar(24,2));
    }


}
