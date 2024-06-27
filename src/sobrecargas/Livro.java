package sobrecargas;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    //método construtor um
    //construtor sem parâmetro
    public Livro() {
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.ano = 0;
    }

    //método construtor  dois
    //construtor só com titulo
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = 0;
    }

    //método construtor  tres
    //construtor com todos os atributos
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }
}
