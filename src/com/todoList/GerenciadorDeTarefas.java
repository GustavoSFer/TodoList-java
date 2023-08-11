package com.todoList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GerenciadorDeTarefas {
  private final String path = "C:\\contato/listaTarefa.txt";
  private ArrayList<Tarefa> listaTarefas;
  private File meuArquivo = new File(path);

  public void novaTarefa(String tarefa) {
    Tarefa fazer = new Tarefa(tarefa);
    listaTarefas.add(fazer);
  }

  private void salvarTarefaNoArquivo() throws IOException {
    FileWriter write = null;
    BufferedWriter buffer = null;

    try {
      if (!meuArquivo.exists()) {
        meuArquivo.createNewFile();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      write = new FileWriter(meuArquivo);
      buffer = new BufferedWriter(write);
      for (Tarefa t : listaTarefas) {
        buffer.write(t.getNome());
        buffer.flush();
        buffer.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      write.close();
      buffer.close();
    }
  }
}
