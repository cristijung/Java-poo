package strings;

public class StringExample {
    public static void main(String[] args) {
        // Literais de String
        String str1 = "Hello";
        String str2 = "Hello";

        // Ambas as variáveis apontam para a mesma string no pool
        System.out.println("str1 == str2: " + (str1 == str2)); // true

        // Objetos de String
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        // str3 e str4 são referências diferentes
        System.out.println("str3 == str4: " + (str3 == str4)); // false

        // Comparação de conteúdo
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str3.equals(str4): " + str3.equals(str4)); // true

        // Adicionando explicitamente ao pool
        String str5 = str3.intern();
        String str6 = str4.intern();

        // str5 e str6 agora apontam para a string no pool
        System.out.println("str1 == str5: " + (str1 == str5)); // true
        System.out.println("str5 == str6: " + (str5 == str6)); // true
    }
}
