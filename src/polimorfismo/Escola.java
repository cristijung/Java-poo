package polimorfismo;

public class Escola {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana Banan", 25, 1.75);
        Aluno aluno = new Aluno("Pafúncio", 18, 1.80, "2025", "ADS");
        Professor professor = new Professor("Dra Mara Silva", 50, 1.70, "Tecnologia da Informação");
        //polimorfismo dos objetos
        Pessoa[] pessoas = {pessoa, aluno, professor};

        for (Pessoa p : pessoas) {
            p.mostrarDetalhes();
            System.out.println();

        }
    }
}
