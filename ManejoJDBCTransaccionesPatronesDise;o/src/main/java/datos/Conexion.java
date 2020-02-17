package datos;

import java.sql.*;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost/test?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_USER = "Enrique";
    private static final String JDBC_PASS = "1.2.3.4.5.6.7.8.9";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL,JDBC_USER, JDBC_PASS);
    }

    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
