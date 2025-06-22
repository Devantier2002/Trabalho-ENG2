// Main.java
public class Main {
    public static void main(String[] args) {
        Configuracao c1 = Configuracao.getInstance();
        Configuracao c2 = Configuracao.getInstance();
        System.out.println(c1 == c2); // true
    }
}
