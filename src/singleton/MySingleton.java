package singleton;

/**
 * Created by ender on 20/01/15.
 */
public class MySingleton implements IMySingleton {

    private static MySingleton INSTANCE = new MySingleton();

    public static IMySingleton getInstance() {
        return INSTANCE;
    }

    private MySingleton() {
    }

    @Override
    public String[] query(String query) {
        return new String[0];
    }
    public String[] query2(String query) {
        return new String[0];
    }
}
