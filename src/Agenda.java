public class Agenda {
  private Contato[] listaContato;
  private Integer max = 5;
  private Integer pointer = 0;

  public Agenda() {
    listaContato = new Contato[max];
  }

  public void addContatos(Contato c) {

    if (pointer <= max) {
      listaContato[pointer] = c;
      this.pointer++;

      System.out.println("Contato adicionado com sucesso!");
    } else {
      System.err.println("[ERROR]: Já existe contatos demais na agenda, remova algum.");
    }

  }

  public void removeContatos(Contato c) {

    if (listaContato == null || pointer < 0) {
      System.err.println("[ERROR]: Não existe contatos na agenda, adicione algum.");

    } else {
      for (int i = 0; i < pointer; i++) {
        listaContato[i].setEmail(null);
        listaContato[i].setTelefone(null);
        listaContato[i].setEndereco(null);
        listaContato[i].setNome(null);
      }

      System.out.println("\nContato removido com sucesso!\n");
    }
  }

  public void alteraContatos(Contato c) {

    for (int i = 0; i < pointer; i++) {
      if (c.equals(listaContato[i])) {
        listaContato[i].setNome("Default");
        listaContato[i].setEmail("default@email.com");
        listaContato[i].setTelefone("0800 7777 7000");
        listaContato[i].setEndereco("Largo da lapinha");

        System.out.println("Contato alterado com sucesso!");

      }

    }

    if (listaContato == null || pointer < 0) {
      System.err.println("[ERROR]: Não existe contatos na agenda, adicione algum.");
    }
  }

  public void listarContatos() {
    for (Integer i = 0; i < pointer; i++) {
      System.out.println("\nSeu nome é: " + listaContato[i].getNome());
      System.out.println("Seu telefone é: " + listaContato[i].getTelefone());
      System.out.println("Seu endereço é: " + listaContato[i].getEndereco());
      System.out.println("Seu e-mail é: " + listaContato[i].getEmail());
    }
  }
}
