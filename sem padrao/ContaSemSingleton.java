public class Application {
    public static void main(String[] args) {
        Database db1 = new Database(); // cria nova instância
        db1.query("SELECT * FROM clientes");

        Database db2 = new Database(); // cria outra nova instância
        db2.query("SELECT * FROM pedidos");

        System.out.println(db1 == db2); // false ❌
    }
}