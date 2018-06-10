package Model;


import java.sql.Connection;
import java.sql.DriverManager;

    /**
     * Created by IL984626 on 30/12/2017.
     */
    public class SqliteHelper {
        private static Connection c = null;
        public static Connection getConn() throws Exception {
            if(c == null){
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:db.db");
            }
            return c;
        }
    }

