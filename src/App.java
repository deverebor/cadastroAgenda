public class App {
    public static void main(String[] args) throws Exception {
        Agenda agd = new Agenda();

        Contato cnt1 = new Contato();
        cnt1.setNome("Lucas Souza");
        cnt1.setTelefone("71 9 9876-6545");
        cnt1.setEndereco("Imbui");
        cnt1.setEmail("lucas@email.com\n");

        agd.addContatos(cnt1);

        Contato cnt2 = new Contato();
        cnt2.setNome("Geisielle Souza");
        cnt2.setTelefone("71 9 9762-5434");
        cnt2.setEndereco("Pau da Lima");
        cnt2.setEmail("geise@email.com");

        agd.addContatos(cnt2);

        agd.removeContato(cnt1);

        agd.listarContatos();
    }
}
