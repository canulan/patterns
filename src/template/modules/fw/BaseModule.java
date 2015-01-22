package template.modules.fw;

import template.Context;
import template.IModule;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ender on 22/01/15.
 */
public abstract class BaseModule implements IModule {

    protected Services services = new Services();

    protected static class Pair<T> {
        public Class<T> cls;
        public T srv;

        public static Pair of(Class<?> cls, Object srv) {
            Pair pair = new Pair();
            pair.cls = cls;
            pair.srv = srv;
            return pair;
        }
    }

    public static class Services {
        private Map<Class, Object> serviceMap = new HashMap<>();

        public <T> T getService(Class<T> service) {
            return (T) serviceMap.get(service);
        }

        public void put(Class<?> cls, Object srv) {
            serviceMap.put(cls, srv);
        }
    }


    @Override
    public final void start(Context context) {
        getServiceObjects(context);
        Pair[] regServices = getRegisterServices();
        for (Pair p : regServices) {
            context.registerService(p.cls, p.srv);
            services.put(p.cls, p.srv);
        }
        start();
    }

    protected abstract void start();

    protected abstract Class[] getServices();

    protected abstract Pair[] getRegisterServices();

    private void getServiceObjects(Context context) {
        Class[] srvClasses = getServices();
        for (Class c : srvClasses) {
            services.put(c, context.getService(c));
        }
    }

    @Override
    public final void stop(Context context) {
    }

}
