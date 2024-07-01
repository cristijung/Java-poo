package collections.manipulando;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Medicamento> medicamentos = Collections.synchronizedList(new ArrayList<>());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar medicamento");
            System.out.println("2. Atualizar preço do medicamento");
            System.out.println("3. Remover medicamento");
            System.out.println("4. Listar todos os medicamentos");
            System.out.println("5. Ordenar medicamentos");
            System.out.println("6. Buscar medicamento por código");
            System.out.println("7. Inverter ordem dos medicamentos");
            System.out.println("8. Embaralhar medicamentos");
            System.out.println("9. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do medicamento: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Digite o nome do medicamento: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do medicamento: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    Medicamento novoMedicamento = new Medicamento(codigo, nome, preco);
                    medicamentos.add(novoMedicamento);
                    System.out.println("Medicamento adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o código do medicamento: ");
                    codigo = scanner.nextLine();
                    Medicamento medicamento = encontrarMedicamentoPorCodigo(medicamentos, codigo);
                    if (medicamento != null) {
                        System.out.print("Digite o novo preço do medicamento: ");
                        preco = scanner.nextDouble();
                        scanner.nextLine();
                        medicamento.setPreco(preco);
                        System.out.println("Preço atualizado com sucesso!");
                    } else {
                        System.out.println("Medicamento não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o código do medicamento: ");
                    codigo = scanner.nextLine();
                    medicamento = encontrarMedicamentoPorCodigo(medicamentos, codigo);
                    if (medicamento != null) {
                        medicamentos.remove(medicamento);
                        System.out.println("Medicamento removido com sucesso!");
                    } else {
                        System.out.println("Medicamento não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Lista de medicamentos:");
                    synchronized (medicamentos) {
                        for (Medicamento m : medicamentos) {
                            System.out.println(m);
                        }
                    }
                    break;

                case 5:
                    Collections.sort(medicamentos);
                    System.out.println("Medicamentos ordenados por código.");
                    break;

                case 6:
                    System.out.print("Digite o código do medicamento: ");
                    codigo = scanner.nextLine();
                    Collections.sort(medicamentos);  //busca binária
                    int index = Collections.binarySearch(medicamentos, new Medicamento(codigo, "", 0));
                    if (index >= 0) {
                        System.out.println("Medicamento encontrado: " + medicamentos.get(index));
                    } else {
                        System.out.println("Medicamento não encontrado.");
                    }
                    break;

                case 7:
                    Collections.reverse(medicamentos);
                    System.out.println("Ordem dos medicamentos invertida.");
                    break;

                case 8:
                    Collections.shuffle(medicamentos);
                    System.out.println("Medicamentos embaralhados.");
                    break;

                case 9:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    //sincronizando
    private static Medicamento encontrarMedicamentoPorCodigo(List<Medicamento> medicamentos, String codigo) {
        synchronized (medicamentos) {
            for (Medicamento medicamento : medicamentos) {
                if (medicamento.getCodigo().equals(codigo)) {
                    return medicamento;
                }
            }
        }
        return null;
    }
}

