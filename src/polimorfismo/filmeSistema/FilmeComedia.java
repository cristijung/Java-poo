package polimorfismo.filmeSistema;

public class FilmeComedia extends Filme {
    private int piadas;

    public FilmeComedia(String titulo, int duracao, String diretor, int piadas) {
        super(titulo, duracao, diretor);
        this.piadas = piadas;
    }

    public int getPiadas() {
        return piadas;
    }

    @Override
    //polimorfismo
    public void calcularPreco() {
        double preco = getDuracao() * 0.08 + piadas * 0.30;
        System.out.println("Preço do Filme de Comédia: R$ " + preco);
    }
}
