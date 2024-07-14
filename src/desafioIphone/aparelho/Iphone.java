package desafioIphone.aparelho;

import desafioIphone.funcionalidades.navegador.Navegador;
import desafioIphone.funcionalidades.radio.Radio;
import desafioIphone.funcionalidades.telefone.Telefone;

public class Iphone implements Radio, Telefone, Navegador {

    @Override
    public void tocando() {
        System.out.println("Música muito boa!");
    }

    @Override
    public void pausando() {
        System.out.println("Gosto muito dessa mas");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando minhas músicas favoritas");
    }


    @Override
    public void ligando(String numero) {
        System.out.println("Ligando para o contato");
    }

    @Override
    public void atendendo() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Enviando recado importante");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Entrando na minha pagina pessoal");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Acessando outra conta pessoal");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando meus dados");
    }
}
