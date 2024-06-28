package relacionamentos.associacao;

public class Pessoa {
    private final String nome;
    private final Carro CARRO; // associação: uma pessoa pode ter um carro

    public Pessoa(String nome, Carro carro) {
        this.nome = nome;
        this.CARRO = carro;
    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        if (CARRO != null) {
            System.out.println("Carro: " + CARRO.getModelo() + " - " + CARRO.getCor());
        } else {
            System.out.println("Sem carro associado.");
        }
    }
}
