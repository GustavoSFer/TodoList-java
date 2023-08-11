package com.todoList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GerenciadorDeTarefas {
  private final String path = "C:\\contato/listaTarefa.txt";
  private ArrayList<Tarefa> listaTarefas = new ArrayList<Tarefa>();
  private File meuArquivo = new File(path);

  public void novaTarefa(String tarefa) throws IOException {
    Tarefa fazer = new Tarefa(tarefa);
    listaTarefas.add(fazer);
    salvarTarefaNoArquivo();
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

    write = new FileWriter(meuArquivo);
    buffer = new BufferedWriter(write);
    try {
      for (Tarefa t : listaTarefas) {
        buffer.write(t.getNome());
        buffer.flush();
        buffer.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      buffer.close();
      write.close();
    }
  }
}
