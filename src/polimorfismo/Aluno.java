package polimorfismo;

public class Aluno extends Pessoa {
    //atributos adicionaus da classe
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, double altura, String matricula, String curso) {
        super(nome, idade, altura);
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
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); //chamar o método da classe base - classe Pessoa
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }

}
