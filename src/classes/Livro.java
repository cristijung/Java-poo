package classes;
//exemplo de uma classe padrão
//anatomia de uma classe

public class Livro {
    //atributos --> são características da classe
    public String titulo;
    public String autor;
    public double preco;
    public int quantidadeEstoque;

    //contrutor -- referência e invocação
    public Livro(String titulo, String autor, double preco, int quantidadeEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //método para exibir as infos do livro
    public void exibirInformacoes() {
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }

    //método main
    public static void main(String[] args) {
        Livro livroUm = new Livro("It", "Stephen King", 99.99, 12);
        livroUm.exibirInformacoes();
    }
}
