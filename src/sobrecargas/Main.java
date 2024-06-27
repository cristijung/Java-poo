package sobrecargas;

public class Main {
    public static void main(String[] args) {
        //exe do uso da classe Biblioteca com sobrecarga de métodos normais
        //dois métodos criados na classe Biblioteca, um possui os parâmetros de título e ano e o outro possui os parametros
        //titulo e autor
        Biblioteca biblioteca = new Biblioteca("Biblioteca Traça", "Rua ABC, 45");
        biblioteca.exibirInformacoes();
        biblioteca.adicionarLivros("Java é Vida", 2020);
        biblioteca.adicionarLivros("It", "Stephen King");

        System.out.println();

        //exe do uso da classe Livro com a sobrecarga de métodos construtores
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Drácula", "Bram Stoker");
        Livro livro3 = new Livro("ABC da Vida", "Ana Banana", 2020);

        livro1.exibirInformacoes();
        System.out.println();
        livro2.exibirInformacoes();
        System.out.println();
        livro3.exibirInformacoes();
        System.out.println();




    }
}
