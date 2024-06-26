package atributos;
//atributos e visibilidade
public class Gato {
    public String nome;
    private String sexo;
    public int idade;
    private double peso;
    public String corDoPelo;


public Gato(String nome, String sexo, int idade, double peso, String corDoPelo) {
    this.nome = nome;
    this.sexo = sexo;
    this.idade = idade;
    this.peso = peso;
    this.corDoPelo = corDoPelo;
}

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}