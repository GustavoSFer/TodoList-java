package com.todoList;

import java.io.IOException;

public class MainTarefa {

  public static void main(String[] args) throws IOException {
    GerenciadorDeTarefas minhaTarefa = new GerenciadorDeTarefas();

    minhaTarefa.novaTarefa("Verificar se salvou no arquivo");
    minhaTarefa.novaTarefa("Verificar se salvou no arquivo2");
  }

}
