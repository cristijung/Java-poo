package relacionamentos.associacao;

public class Carro {
    private final String modelo;
    private final String cor;

    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

   public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }
}

