package dao;

import dao.roles.Role;
import dao.roles.RoleGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ender on 20/01/15.
 */
public class RoleProcessor {


    private Map<Role, List<Class<?>>> services = new HashMap<>();

    public RoleProcessor() {
    }

    public void process() {
        Class<?>[] interfaces = PersonDao.class.getInterfaces();
        for (Class<?> service : interfaces) {
            RoleGroup rg = service.getAnnotation(RoleGroup.class);
            if (rg == null) {
                continue;
            }
            addServices(service, rg);
        }
    }

    private void addServices(Class<?> service, RoleGroup rg) {
        Role[] roles = rg.value();
        for (Role role: roles) {
            List<Class<?>> srvList = services.get(role);
            if (srvList == null) {
                srvList = new ArrayList<>();
                services.put(role, srvList);
            }
            srvList.add(service);
        }
    }

    public static void main(String[] args) {
        RoleProcessor processor = new RoleProcessor();
        processor.process();
        System.out.println(processor.services);
    }


}
