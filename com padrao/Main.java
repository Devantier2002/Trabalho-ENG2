public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        db1.query("SELECT * FROM usuarios");

        Database db2 = Database.getInstance();
        db2.query("SELECT * FROM produtos");

        System.out.println(db1 == db2); // true
    }
}
