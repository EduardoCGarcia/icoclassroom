package ihm.icoclassroom.db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/icoclassroom?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "admin";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASS);
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(PreparedStatement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
    
    public static void main(String[] args) {
        try {
            Connection con = null;
            con = Conexion.getConnection();System.out.println("conexion exitosa");
            Conexion.close(con);
        } catch (SQLException ex) {
            
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
}
