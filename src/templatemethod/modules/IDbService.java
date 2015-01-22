package templatemethod.modules;

import java.sql.Connection;

/**
 * Created by ender on 22/01/15.
 */
public interface IDbService {

    Connection getConnection();
}
