package generics;

//exemplo de método generico

public class Util {
    public static <T> void imprimirArray(T[] array) {
        for (T elementos : array) {
            System.out.println(elementos);
        }
    }
}
