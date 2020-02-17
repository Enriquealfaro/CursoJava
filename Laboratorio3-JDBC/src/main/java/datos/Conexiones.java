package datos;

import java.sql.*;

public class Conexiones {

    private static final String USER_URL= "jdbc:mysql://localhost/test?useSSL=false&useTimezone=false&serverTimezone=UTC";
    private static final String USER_NAME = "Enrique";
    private static final String USER_PASS = "1.2.3.4.5.6.7.8.9";

    public static Connection getConexion() throws SQLException {
       return DriverManager.getConnection(USER_URL,USER_NAME,USER_PASS);
    }

    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
