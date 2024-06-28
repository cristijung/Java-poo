package  polimorfismo.filmeSistema;
//FilmeAcao e FilmeComedia são classes concretas que herdam de Filme e implementam o método abstrato calcularPreco.

public class FilmeAcao extends Filme {
    private int cenasAcao;

    public FilmeAcao(String titulo, int duracao, String diretor, int cenasAcao) {
        super(titulo, duracao, diretor);
        this.cenasAcao = cenasAcao;
    }

    public int getCenasAcao() {
        return cenasAcao;
    }

    @Override
    //polimorfismo
    public void calcularPreco() {
        double preco = getDuracao() * 0.10 + cenasAcao * 0.50;
        System.out.println("Preço do Filme de Ação: R$ " + preco);
    }
}

