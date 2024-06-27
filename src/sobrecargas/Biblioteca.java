package sobrecargas;

public class Biblioteca {
    private String nome;
    private String endereco;

    //construtor
    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // sobrecarga de métodos 'normais' para add livros
    //método 1
    public void adicionarLivros(String titulo, String autor) {
        System.out.println("Livro adicionado: " + titulo + " por " + autor);
    }

    //métodos2
    public void adicionarLivros(String titulo, int ano) {
        System.out.println("Livro adicionado: " + titulo + " por " + " (Ano: " + ano + ")");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void exibirInformacoes() {
        System.out.println("Biblioteca: " + nome);
        System.out.println("Endereço: " + endereco);
    }
}
