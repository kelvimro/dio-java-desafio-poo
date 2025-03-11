package iphone;

import recursos.AparelhoTelefonico;
import recursos.NavegadorInternet;
import recursos.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private boolean estaTocando = false;
    private String musicaAtual = "";
    public final String modelo;

    public IPhone(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void tocar() {
        if (estaTocando) {
            System.out.println("A música já está tocando.");
        } else {
            System.out.println("Tocando música.");
            estaTocando = true;
        }
    }

    @Override
    public void pausar() {
        if (estaTocando) {
            System.out.println("Pausando música");
            estaTocando = false;
        } else {
            System.out.println("Não há música tocando.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        if (musicaAtual.equals(musica)) {
            System.out.println("A " + musica + " já esta selecionada.");
        } else {
            musicaAtual = musica;
            System.out.println("Selecionando " + musica);
        }
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
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
