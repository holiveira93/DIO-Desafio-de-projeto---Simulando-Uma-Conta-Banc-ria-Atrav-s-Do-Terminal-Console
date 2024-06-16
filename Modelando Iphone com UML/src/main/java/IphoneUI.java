import classes.Iphone;

public class IphoneUI {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Peaches - Jack Black");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("51999888777");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        iphone.exibirPagina("www.centraldeanimes.com.br");
        iphone.atualizarPagina();
        iphone.atualizarPagina();

    }
}
