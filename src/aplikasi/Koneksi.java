import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Koneksi {
    private static Connection con;
    private static Statement stm;

    public static Connection getConnection() {
        if (con == null) {
            try {
                String url = "jdbc:mysql://localhost/cobain";
                String user = "root";
                String pass = "";
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                stm = con.createStatement();
                System.out.println("Connection established.");
            } catch (Exception e) {
                System.err.println("Connection failed: " + e.getMessage());
            }
        }
        return con;
    }
}
