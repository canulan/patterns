package singleton;

/**
 * Created by ender on 20/01/15.
 */
public class MySingleton2 {

    private static MySingleton2 INSTANCE;

    public static MySingleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (MySingleton2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MySingleton2();
                }
            }
        }
        return INSTANCE;
    }

    private MySingleton2() {
    }

    public static void main(String[] args) {

        MySingleton2 instance = MySingleton2.getInstance();


    }


}
