import org.iphone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone("15", "Preto");

        System.out.println("Iphone " + iphone.getModelo() + ", cor " + iphone.getCor());

        iphone.acessarSite();
        iphone.baixarConteudo();
        iphone.proximaMusica();
        iphone.tocarMusica();
        iphone.atenderLigacao();
        iphone.realizarLigacao();
    }
}
