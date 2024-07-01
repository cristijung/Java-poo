package collections.linkedlist;

import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList<String> tarefas = new LinkedList<>();

        //add elementos
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Ler um livro");
        tarefas.add("Começar um programa");

        System.out.println("Meu ToDo: " + tarefas);

        //add tarefas no inicio
        tarefas.addFirst("Acordar cedo");
        System.out.println("Adicionando elemento no início: " + tarefas);

        //add tarefas no final
        tarefas.addLast("Ir jogar");
        System.out.println("Adicionando elemento no final da lista: " + tarefas);

        //removendo o primeiro elemento
        tarefas.removeFirst();
        System.out.println("Removendo elemento no início: " + tarefas);

        //removendo o último elemento
        tarefas.removeLast();
        System.out.println("Removendo elemento do final: " + tarefas);

        //iterando sobre elementos do LinkedList
        System.out.println("Iterando sobre tarefas:");
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }

    }
}
