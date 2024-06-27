package heranca;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String corDoCabelo;
    private String comorbidade;

    public Pessoa(String nome, int idade, double altura, double peso, String corDoCabelo, String comorbidade) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.corDoCabelo = corDoCabelo;
        this.comorbidade = comorbidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public String getComorbidade() {
        return comorbidade;
    }

    public void setComorbidade(String comorbidade) {
        this.comorbidade = comorbidade;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Cor do cabelo: " + corDoCabelo);
        System.out.println("Possui comorbidade, qual?: " + comorbidade);
    }
}
