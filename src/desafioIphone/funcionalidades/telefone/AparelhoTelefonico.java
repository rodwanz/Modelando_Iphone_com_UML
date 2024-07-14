package desafioIphone.funcionalidades.telefone;

public class AparelhoTelefonico implements Telefone {
    public void  ligando(String numero){
        System.out.println("Fazendo ligação");
    }

    public void atendendo() {
        System.out.println("Recebendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Falando com meu folho");
    }
}
