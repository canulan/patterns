package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by ender on 21/01/15.
 */
public class DbServiceHandler implements InvocationHandler {

    private IDbService realService;

    public DbServiceHandler(IDbService service) {
        this.realService = service;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Calling method: " + method.getName() + " with params: "+args);
        // Before
        Object invoke = null;
        try {
          invoke = method.invoke(realService, args);
        } catch (Throwable t) {
            // Throws
            throw t;
        }
        // After
        return invoke;
    }


    public static void main(String[] args) {
        IDbService realService = new DbService();
        DbServiceHandler proxy = new DbServiceHandler(realService);

        IDbService service = (IDbService)
                Proxy.newProxyInstance(DbService.class.getClassLoader(),
                DbService.class.getInterfaces(),
                proxy);

        service.getConnection();

    }
}
