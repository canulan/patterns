package observer.fault.singleton;

/**
 * Created by ender on 20/01/15.
 */
public class MySingleton {

    private static MySingleton INSTANCE = new MySingleton();

    public static MySingleton getInstance() {
        return INSTANCE;
    }

    private MySingleton() {}

    public static void main(String[] args) {
        MySingleton instance = MySingleton.getInstance();
    }


    public String[] query(String query) {
        return new String[0];
    }
}
