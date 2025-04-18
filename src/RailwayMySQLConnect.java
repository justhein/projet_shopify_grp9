import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RailwayMySQLConnect {
    public static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://switchyard.proxy.rlwy.net:13412/railway";
            String user = "root";
            String password = "WydmwrwaslpxHHQQBjhJIDCmEEWRlZwm"; // Ton vrai mot de passe Railway

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion réussie à Railway !");
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        connect();
    }
}
