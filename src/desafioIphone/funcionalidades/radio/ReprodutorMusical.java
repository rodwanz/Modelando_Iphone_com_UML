package desafioIphone.funcionalidades.radio;

public class ReprodutorMusical implements Radio{
    public void  tocando(){
        System.out.println("Rádio funcionando");
    }

    @Override
    public void pausando() {
        System.out.println("Procurando outra música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando música");
    }
}
