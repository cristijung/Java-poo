package relacionamentos.agregacao;
import java.util.ArrayList;
import java.util.List;

//a relação de agregação é definida a partir da lista de livros de referência aos atributos definidos na classe livro
class Biblioteca {
    private String nome;
    private List<Livro> livros; // agregação - Biblioteca contém uma lista de Livros

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>(); // inicializando a lista de livros
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    public void mostrarLivros() {
        System.out.println("Livros na biblioteca " + nome + ":");
        for (Livro livro : livros) {
            livro.mostrarDetalhes();
        }
    }
    public String getNome() {
        return nome;
    }
}