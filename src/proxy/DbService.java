package proxy;

import java.sql.Connection;
import java.util.List;

/**
 * Created by ender on 21/01/15.
 */
public class DbService implements IDbService {

    public DbService() {
    }

    public Connection getConnection() {
        System.out.println("Get connection");
        return null;
    }

    public void closeConnection() {
        System.out.println("Close connection");

    }

    public List<Object> query(String query) {
        System.out.println("Query");
        return null;
    }

}
