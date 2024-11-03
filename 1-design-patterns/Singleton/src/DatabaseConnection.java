public class DatabaseConnection {
    private static DatabaseConnection instance;
    private long connectionTime;

    private DatabaseConnection() {
        this.connectionTime = System.currentTimeMillis();
        System.out.println("Database connection created at " + connectionTime);
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
    public long getConnectionTime() {
        return connectionTime;
    }
}
