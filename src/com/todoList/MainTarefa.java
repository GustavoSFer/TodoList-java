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
          .println("1- Cadastrar nova tarefa\n2- Listar todas as tarefas\3- Sair do programa");

    }

    minhaTarefa.novaTarefa("Verificar se salvou no arquivo");
    minhaTarefa.novaTarefa("Verificar se salvou no arquivo2");

    minhaTarefa.listarTarefas();
  }

}
