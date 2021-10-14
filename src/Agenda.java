public class Agenda {
  private Contato[] listaContato;
  private Integer max = 5;
  private Integer pointer = 0;

  public Agenda() {
    listaContato = new Contato[max];
  }

  public void addContatos(Contato c) {

    if (pointer <= 5) {
      listaContato[pointer] = c;
      this.pointer++;

      System.out.println("Inclusão realizada com sucesso!");
    } else {
      System.err.println("[ERROR]: Já existe contatos demais na agenda, remova algum.");
    }

  }

  public void listarContatos() {
    for (Integer i = 0; i < pointer; i++) {
      System.out.println("Seu nome é: " + listaContato[i].getNome());
      System.out.println("Seu telefone é: " + listaContato[i].getTelefone());
      System.out.println("Seu endereço é: " + listaContato[i].getEndereco());
      System.out.println("Seu e-mail é: " + listaContato[i].getEmail());
    }
  }
}
