package templatemethod;

/**
 * Created by ender on 22/01/15.
 */
public class Context {


    public <T> void registerService(Class<T> inf, T impl) {
    }

    public <T> T getService(Class<T> srvClass) {
        return null;
    }

    public void unregisterService(Object service) {
    }

}
