package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionManager {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Connection conn = null;

        String STR_DRIVER = "org.gjt.mm.mysql.Driver";
        String STR_CONEX = "jdbc:mysql://localhost:3306/dbfutebolmanager";
        String USER = "root";
        String PASSWORD = "root";

        
            Class.forName(STR_DRIVER);
            conn = DriverManager.getConnection(STR_CONEX, USER, PASSWORD);
        
      
        return conn;
    }
}
