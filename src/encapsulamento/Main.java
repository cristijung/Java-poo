package encapsulamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //isntancia da classe
        Pessoa p1 = new Pessoa();

        //acessando o atributo nome
        //acessa direto, pois o atributo é público
        System.out.println("Digite seu nome: ");
        p1.nome = ler.nextLine();

        //acessando atributos privados
        System.out.println("Digite a sua idade: ");
        p1.setIdade(ler.nextInt());

        //acessando atributos privados
        System.out.println("Digite seu peso: ");
        p1.setPeso(ler.nextDouble());

        System.out.println("-- Visualizando os dados --");
        System.out.println("Nome: " + p1.nome);
        //obtendo os dados gravados nos atributos privados
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Seu peso é: " + p1.getPeso());
    }
}
