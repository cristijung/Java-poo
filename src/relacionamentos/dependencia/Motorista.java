package relacionamentos.dependencia;

public class Motorista {
    private String nome;

    public Motorista(String nome) {
        this.nome = nome;
    }

    // método da classe Motorista que depende da classe Carro --- aqui é a dependência-----
    public void dirigir(Carro carro) {
        System.out.println(nome + " está dirigindo o carro " + carro.getModelo() + " com placa " + carro.getPlaca());
        carro.ligar();
        carro.desligar();
    }

    public String getNome() {
        return nome;
    }
}

