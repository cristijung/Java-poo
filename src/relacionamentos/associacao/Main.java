package relacionamentos.associacao;

public class Main {
    public static void main(String[] args) {
        // criação de um objeto Carro
        Carro carro1 = new Carro("Porsche", "Prata");

        // criação de um objeto Pessoa com associação a um carro
        Pessoa pessoa1 = new Pessoa("Ana Banana", carro1);

        // exibe as informações da pessoa e do carro q foi associado
        pessoa1.exibirInformacoes();

        // criação de outro objeto Pessoa sem carro associação a um carro
        Pessoa pessoa2 = new Pessoa("Pafúncio", null);

        // informações da pessoa sem carro associado...
        pessoa2.exibirInformacoes();
    }
}
