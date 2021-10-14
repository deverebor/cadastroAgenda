public class App {
    public static void main(String[] args) throws Exception {
        Agenda agd = new Agenda();

        Contato cnt1 = new Contato();
        cnt1.setNome("Lucas Souza");
        cnt1.setTelefone("71 9 98766545");
        cnt1.setEndereco("Imbui");
        cnt1.setEmail("lucas@email.com");

        agd.addContatos(cnt1);

        agd.listarContatos();
    }
}
