package singleton;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        Database database2 = Database.getInstance();
        Database database3 = Database.getInstance();
        Database database4 = Database.getInstance();
        Database database5 = Database.getInstance();

        database.executeQuery("Execuntando do um");
        database2.executeQuery("Executando do dois");
        database3.executeQuery("Executando do três");
        database4.executeQuery("Executando...");
        database5.executeQuery("exx...");

    }
}
