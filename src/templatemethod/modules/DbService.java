package templatemethod.modules;


import java.sql.Connection;

/**
 * Created by ender on 22/01/15.
 */
public class DbService implements IDbService {


    private ILoggingService logging;

    public DbService(ILoggingService logging) {
        this.logging = logging;
    }

    @Override
    public Connection getConnection() {
        // Use logging
        return null;
    }
}
