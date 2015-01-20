package dao;

import dao.roles.Role;
import dao.roles.RoleGroup;

/**
 * Created by ender on 20/01/15.
 */
@RoleGroup({Role.ADMIN, Role.DBA, Role.USER})
public interface IPersonQuery {

    // Select
    public void query();

}
