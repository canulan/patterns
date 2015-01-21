package service;

import java.sql.Connection;
import java.util.List;

/**
 * Created by ender on 21/01/15.
 */
public class DbServiceWrapper implements IDbService, IDbTracker {

    private IDbService service;

    public DbServiceWrapper(IDbService service) {
        this.service = service;
    }

    @Override
    public Connection getConnection() {
        // Log
        // Alarm
        return service.getConnection();
    }

    @Override
    public void closeConnection() {
        //
        service.closeConnection();

    }

    @Override
    public List<Object> query(String query) {
        return service.query(query);
    }

    @Override
    public void register(IDbListener listener) {

    }
}
