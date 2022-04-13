package app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {

    String host;
    String port;
    String db;
    String usr;
    String pwd;

    public OracleConnection() {
        this.host = "localhost";
        this.usr = "winda";
        this.pwd = "195314017";
        this.db = "xe";
        this.port = "1521";
    }

    public Connection getConnection() {
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracl:thin:@" + host + ":"
                    + port + ":" + db, usr, pwd);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return conn;
    }
    
    public static void main(String[] args) throws SQLException {
 OracleConnection ora = new OracleConnection();
        Connection conn = ora.getConnection();
       

    }
}
 