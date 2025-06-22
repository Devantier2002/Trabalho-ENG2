public class ContaConfiguracaoSemSingleton {
    public static void main(String[] args) {
        Configuracao c1 = new Configuracao();
        Configuracao c2 = new Configuracao();
        System.out.println(c1 == c2); // false
    }
}

class Configuracao {
    public Configuracao() {
        System.out.println("Nova configuração criada.");
    }
}
