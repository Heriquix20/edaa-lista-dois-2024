package ListaDois.Celular;

public class ModeloBasico implements Celular {

    public void ligar() {
      System.out.println("Celular modelo básico ligado");
    }  

    public void desligar() {
        System.out.println("Celular modelo básico desligado");
      }  

    public void fazerLigacao(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para o número: " + numero + " mensagem: " + mensagem);
    }

}
