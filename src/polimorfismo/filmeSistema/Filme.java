package  polimorfismo.filmeSistema;

public abstract class Filme extends Conteudo {
    private String diretor;

    public Filme(String titulo, int duracao, String diretor) {
        super(titulo, duracao);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Diretor: " + diretor);
    }

    public abstract void calcularPreco();
}

