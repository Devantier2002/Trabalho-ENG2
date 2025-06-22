// Configuracao.java
public class Configuracao {
    private static Configuracao instancia;

    private Configuracao() {
        System.out.println("Configuração criada.");
    }

    public static Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }
}
