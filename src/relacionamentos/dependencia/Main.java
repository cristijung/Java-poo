package relacionamentos.dependencia;

public class Main {
    public static void main(String[] args) {
        // criando instâncias de Carro e Motorista
        Carro meuCarro = new Carro("Toyota", "ABC-1234");
        Motorista motorista = new Motorista("Esmeraldo");

        // Motorista dirigindo o carro
        motorista.dirigir(meuCarro);
    }
}
