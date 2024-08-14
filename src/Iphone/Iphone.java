package Iphone;

import aparelhotelefonico.Aparelho;
import navegadornainternet.Navegador;
import reprodutormusical.Reprodutor;

public class Iphone implements Reprodutor, Aparelho, Navegador{
    public void tocar(){
        System.out.println("Tocando Reprodutor Musical");
    }

    public void pausar(){ 
        System.out.println("Pausando Reprodutor Musical");
    }

    public void selecionarMusica(String musica){
        System.out.println("Selecionando Música no Reprodutor Musical: " + musica); 
    }

    public void ligar(String numero){
        System.out.println("Ligando para o Iphone: " + numero); 
    }

    public void atender(){
        System.out.println("Atendendo Ligação do Iphone"); 
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz do iphone iniciado"); 
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo página no Navegador: " + url); 
    }
    
    public void adicionarNovaAba(){
        System.out.println("Criando uma nova aba no Navegador"); 
    }

    public void atualizarPagina(){
        System.out.println("Atualizando a página no Navegador"); 
    }

}
