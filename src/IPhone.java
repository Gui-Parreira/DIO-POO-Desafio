public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone();

        System.out.println(iPhone.ligar("123456"));
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println("-------------------------------");

        System.out.println(iPhone.selecionarMusica("Mocking bird - Eminem"));
        iPhone.tocar();
        iPhone.pausar();

        System.out.println("-------------------------------");

        System.out.println(iPhone.exibirPagina("https://web.dio.me/home"));
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }

    @Override
    public String ligar(String numero) {
        return "Ligando para o número: " + numero;
    }

    @Override
    public void atender() {
        System.out.println("Atendendo celular.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public String exibirPagina(String url) {
        return "Exibindo página no navegador da internet da url: " + url;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba do navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página do navegador.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando/Reproduzindo música atual.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }

    @Override
    public String selecionarMusica(String musica) {
        return "Selecionando música: " + musica;
    }
}