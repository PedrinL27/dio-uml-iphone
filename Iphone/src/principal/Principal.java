package principal;
import celular.Iphone;

public class Principal {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Welcome To The Jungle");
        iphone.tocar();

        iphone.ligar("997693312");
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("web.dio.me");
        iphone.atualizarAba();
    }
}
