package  polimorfismo.filmeSistema;
//superclasse

public class Conteudo {
    protected String titulo;
    protected int duracao;

    public Conteudo(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
    }
}


