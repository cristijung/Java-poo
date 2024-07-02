package generics;

public class Mamiferos<T> {
    private T nome;

    public T getNome() {
        return nome;
    }

    public void setNome(T nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Mamiferos<String> listaDeString = new Mamiferos<>();
        listaDeString.setNome("Elefante");
        System.out.println(listaDeString.getNome());

        Mamiferos<Integer> listaDePeso = new Mamiferos<>();
        listaDePeso.setNome(12);
        System.out.println(listaDePeso.getNome());

        Mamiferos<Integer> idade = new Mamiferos<>();
        idade.setNome(14);
        System.out.println(idade.getNome());
    }
}
