package relacionamentos.agregacao;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("Drácula", "Bram Stoker");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.mostrarLivros();


    }
}
