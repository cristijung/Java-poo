package polimorfismo.filmeSistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("Bem-vindo ao Sistema de Streaming de Filmes!");
            System.out.println("1. Adicionar Filme de Ação");
            System.out.println("2. Adicionar Filme de Comédia");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); //limpa o buffer

            switch (opcao) {
                case 1:
                    adicionarFilmeAcao(scanner);
                    break;
                case 2:
                    adicionarFilmeComedia(scanner);
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void adicionarFilmeAcao(Scanner scanner) {
        System.out.print("Digite o título do filme de ação: ");
        String tituloAcao = scanner.nextLine();
        System.out.print("Digite a duração do filme de ação (minutos): ");
        int duracaoAcao = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o diretor do filme de ação: ");
        String diretorAcao = scanner.nextLine();
        System.out.print("Digite o número de cenas de ação: ");
        int cenasAcao = scanner.nextInt();
        scanner.nextLine();

        FilmeAcao filmeAcao = new FilmeAcao(tituloAcao, duracaoAcao, diretorAcao, cenasAcao);
        filmeAcao.exibirDetalhes();
        filmeAcao.calcularPreco();
    }

    private static void adicionarFilmeComedia(Scanner scanner) {
        System.out.print("Digite o título do filme de comédia: ");
        String tituloComedia = scanner.nextLine();
        System.out.print("Digite a duração do filme de comédia (minutos): ");
        int duracaoComedia = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o diretor do filme de comédia: ");
        String diretorComedia = scanner.nextLine();
        System.out.print("Digite o número de piadas: ");
        int piadas = scanner.nextInt();
        scanner.nextLine();

        FilmeComedia filmeComedia = new FilmeComedia(tituloComedia, duracaoComedia, diretorComedia, piadas);
        filmeComedia.exibirDetalhes();
        filmeComedia.calcularPreco();
    }
}
