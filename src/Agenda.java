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
      this.pointer--;
      listaContato[pointer] = c;

      System.out.println("\nContato removido com sucesso!\n");
    }
  }

  public void alteraContatos(Contato c, Integer pointer) {

    if (listaContato == null || pointer < 0) {
      System.err.println("[ERROR]: Não existe contatos na agenda, adicione algum.");

    } else {
      this.pointer--;
      listaContato[pointer] = c;

      System.out.println("Contato alterado com sucesso!");
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
