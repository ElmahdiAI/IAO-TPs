
public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.executeQuery("SELECT * FROM users");

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.executeQuery("INSERT INTO users VALUES ('Mehdi', 'AI')");

        System.out.println("Same instance? " + (db1 == db2));
        System.out.println("Connection time is constant: " + db1.getConnectionTime() + " = " + db2.getConnectionTime());
    }
}