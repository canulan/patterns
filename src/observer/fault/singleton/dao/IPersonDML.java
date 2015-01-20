package observer.fault.singleton.dao;

import observer.fault.singleton.dao.roles.Role;
import observer.fault.singleton.dao.roles.RoleGroup;

/**
 * Created by ender on 20/01/15.
 */
@RoleGroup({Role.ADMIN, Role.DBA})
public interface IPersonDML {

    // DML
    public void insert();
    public void update();
    public void delete();

}
