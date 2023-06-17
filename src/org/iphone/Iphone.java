package org.iphone;

public class Iphone implements ReprodutorMusica, NavegadorInternet, AparelhoTelefonico {
    private String modelo;
    private String cor;

    public Iphone(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void acessarSite() {
        System.out.println("Site acessado pelo Iphone");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Ligação atendida pelo Iphone");
    }

    @Override
    public void enviarConteudo() {
        System.out.println("Conteúdo enviado pelo Iphone");
    }

    @Override
    public void realizarLigacao() {
        System.out.println("Ligação feita pelo Iphone");
    }

    @Override
    public void proximaMusica() {
        System.out.println("Próxima música pelo Iphone");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Música anterior pelo Iphone");
    }

    @Override
    public void baixarConteudo() {
        System.out.println("Conteúdo baixado pelo Iphone");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada pelo Iphone");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Música tocando pelo Iphone");
    }
}