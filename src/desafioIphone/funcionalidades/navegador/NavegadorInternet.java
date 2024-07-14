package desafioIphone.funcionalidades.navegador;

public class NavegadorInternet implements Navegador {
    public void exibirPagina(String url) {
        System.out.println("Aprimorando meus conhecimentos");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
