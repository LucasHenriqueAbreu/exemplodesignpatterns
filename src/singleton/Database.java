package singleton;

public class Database {
    private static Database instance;

    private Database() {
        System.out.println("Conectando com o banco de dados...");
        System.out.println("Olá, estou sendo instânciada");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println(this);
        System.out.println(query);
    }
}
