package test.test;

import observer.fault.singleton.Client;
import observer.fault.singleton.IMySingleton;
import org.junit.Test;

/**
 * Created by ender on 20/01/15.
 */

public class TestClient {

    @Test
    public void testQueryMethod() {
        IMySingleton singleton = new IMySingleton() {
            @Override
            public String[] query(String query) {
                return new String[]{query};
            }
        };
        Client client = new Client(singleton);
        Client.Person[] list = client.query("ahmet");
    }

}
