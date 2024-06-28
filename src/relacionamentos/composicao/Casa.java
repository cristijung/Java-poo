package relacionamentos.composicao;

public class Casa {
    private Quarto quarto; // composição - uma Casa sempre vai conter um Quarto

    public Casa(String tipoQuarto) {
        this.quarto = new Quarto(tipoQuarto); // instância de Quarto
    }

    public void mostrarDetalhes() {
        System.out.println("Detalhes da casa:");
        quarto.mostrarDetalhes(); // passando a chamada ao método da classe Quarto
    }
}
