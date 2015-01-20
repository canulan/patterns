package dao;

import dao.roles.Role;
import dao.roles.RoleGroup;

/**
 * Created by ender on 20/01/15.
 */
@RoleGroup({Role.DBA})
public interface IPersonDDL {

    public void create();

    public void drop();


}
