package desafioIphone.funcionando;

import desafioIphone.aparelho.Iphone;
import desafioIphone.funcionalidades.navegador.Navegador;
import desafioIphone.funcionalidades.radio.Radio;
import desafioIphone.funcionalidades.telefone.Telefone;

public class EmFuncionamento {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Radio rd = iphone;
        Telefone tel = iphone;
        Navegador nv = iphone;

        System.out.println("Oubindo muita música!");
        rd.selecionarMusica("Minha favorita");
        rd.tocando();
        rd.pausando();

        System.out.println("Ligando pra casa");
        tel.ligando("3336-7897");
        tel.atendendo();
        tel.iniciarCorreioVoz();

        System.out.println("Acessando meu navegador favorito");
        nv.exibirPagina("dio.me");
        nv.adicionarNovaAba();
        nv.atualizarPagina();
    }
}
