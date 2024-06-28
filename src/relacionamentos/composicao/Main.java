package relacionamentos.composicao;

public class Main {
    public static void main(String[] args) {
        // criando a instância de Casa com um Quarto
        Casa minhaCasa = new Casa("Suíte");

        // mostrando os detalhes da casa e do quarto
        minhaCasa.mostrarDetalhes();
    }
}
