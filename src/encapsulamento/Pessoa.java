package encapsulamento;

public class Pessoa {
    //atributos
    public String nome;
    private int idade;
    private double peso;

    //construtor
    public Pessoa() {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
