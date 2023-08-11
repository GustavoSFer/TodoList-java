package com.todoList;

import java.io.IOException;
import java.util.Scanner;

public class MainTarefa {

  public static void main(String[] args) throws IOException {
    GerenciadorDeTarefas minhaTarefa = new GerenciadorDeTarefas();
    int opcao = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== Bem vindo ao sistema de lista de tarefas ===");
    while (opcao != 3) {
      System.out.println("Esolha a opção desejada: ");
      System.out
          .println("1- Cadastrar nova tarefa\n2- Listar todas as tarefas\n3- Sair do programa");
      opcao = Integer.parseInt(scanner.nextLine());

      switch (opcao) {
        case 1:
          System.out.println("Informa o nome da tarefa:");
          String tarefa = scanner.nextLine();
          minhaTarefa.novaTarefa(tarefa);
          break;
        case 2:
          minhaTarefa.listarTarefas();
          System.out.println();
          break;
        case 3:
          System.out.println("\n     ==============    ");
          System.out.println("Tchau!!! Até a proxima.\nNão se esqueça de fazer suas tarefas!!");
          break;
        default:
          System.out.println("Escolha uma opção valida!");
      }
    }
  }

}
