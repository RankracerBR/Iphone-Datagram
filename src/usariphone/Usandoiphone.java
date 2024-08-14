package usariphone;

import Iphone.Iphone;
import reprodutormusical.Reprodutor;

public class Usandoiphone {
    public static void main(String[] args) {
        Iphone ipn = new Iphone();

        ipn.tocar();
        ipn.pausar();
        ipn.selecionarMusica("Journey, Chain Reaction");
        ipn.ligar("8383374");
        ipn.atender();
        ipn.iniciarCorreioVoz();
        ipn.exibirPagina("www.agstpnts.com.br");
        ipn.adicionarNovaAba();
        ipn.atualizarPagina();
    }
}
