package celular;


public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void exibirPagina(String url) {
        System.out.println("O url da pagina: " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando uma nova aba");
    }
    public void atualizarAba(){
        System.out.println("Atualizando uma aba");
    }

    public void tocar(){
        System.out.println("Tocando a musica");
    }
    public void pausar(){
        System.out.println("Pausando a musica");
    }
    public void selecionarMusica(String musica){
        System.out.println("Tocando a musica: " + musica);
    }

    public void ligar(String numero){
        System.out.println("Discando para o numero: " + numero);
    }
    public void atender(){
        System.out.println("Atendendo o celular");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
} 

