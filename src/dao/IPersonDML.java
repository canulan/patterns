package dao;

import dao.roles.Role;
import dao.roles.RoleGroup;

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
