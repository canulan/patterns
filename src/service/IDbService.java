package service;

import java.sql.Connection;
import java.util.List;

/**
 * Created by ender on 21/01/15.
 */
public interface IDbService {

    Connection getConnection();

    void closeConnection();

    List<Object> query(String query);
}
