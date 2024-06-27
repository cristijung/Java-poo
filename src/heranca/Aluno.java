package heranca;

public class Aluno extends Pessoa{
    //atributos adicionaus da classe
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, double altura, double peso, String corDoCabelo, String comorbidade, String matricula, String curso) {
        super(nome, idade, altura, peso, corDoCabelo, comorbidade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //método para mostrar os detalhes do Aluno
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); //chamar o método da classe base - classe Pessoa
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }

    //método main
    public static void main(String[] args) {
        //criar o objeto Aluno
        Aluno aluno1 = new Aluno("Pafúncio", 20, 1.80, 89, "castanho", "diabético", "2025", "ADS");
        aluno1.mostrarDetalhes();
    }
}
