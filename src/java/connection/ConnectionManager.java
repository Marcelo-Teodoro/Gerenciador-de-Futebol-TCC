package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionManager {

    public static Connection getConnection() {

        Connection conn = null;

        String STR_DRIVER = "org.gjt.mm.mysql.Driver";
        String STR_CONEX = "jdbc:mysql://localhost:3306/dbfutebolmanager";
        String USER = "root";
        String PASSWORD = "";

        try {
            Class.forName(STR_DRIVER);
            conn = DriverManager.getConnection(STR_CONEX, USER, PASSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conn;
    }
}
