public class Database {
    private static Database instance;

    private Database() {
        System.out.println("Conexão com banco criada.");
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executando: " + sql);
    }
}

