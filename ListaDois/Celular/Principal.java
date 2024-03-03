package ListaDois.Celular;

public class Principal {
    public static void main(String[] args) {
       ModeloBasico basico = new ModeloBasico();
       ModeloAvancado avancado = new ModeloAvancado();

       ////Modelo Basico
       basico.ligar();
       basico.fazerLigacao("996431258");
       basico.enviarMensagem("996432157", "Hello man, are u good?");
       basico.desligar();

       ////Modelo Avançado
       avancado.ligar();
       avancado.fazerLigacao("925631452");
       avancado.fazerLigacao("854126397");
       avancado.enviarMensagem("987456325", "Eai cara, tudo bem com você?");
       avancado.enviarMensagem("856324157", "Compro o pão?");
       avancado.desligar();

       ////Hitórico
       System.out.println("\n\nHistórico de mensagens enviadas: " + avancado.getMensagensEnviadas());
       System.out.println("Histórico de ligações feitas: " + avancado.getLigacoesFeitas());
       
    }
}
