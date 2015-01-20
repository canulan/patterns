package observer.fault.singleton;

/**
 * Created by ender on 20/01/15.
 */
public class MySingleton3 {

    private static class SingletonHolder {
        private static MySingleton3 INSTANCE = new MySingleton3();
    }

    public static MySingleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private MySingleton3() {
    }

    public static void main(String[] args) {

        MySingleton3 instance = MySingleton3.getInstance();


    }


}
