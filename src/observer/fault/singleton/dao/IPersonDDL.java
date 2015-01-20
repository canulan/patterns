package observer.fault.singleton.dao;

import observer.fault.singleton.dao.roles.Role;
import observer.fault.singleton.dao.roles.RoleGroup;

/**
 * Created by ender on 20/01/15.
 */
@RoleGroup({Role.DBA})
public interface IPersonDDL {

    public void create();

    public void drop();


}
