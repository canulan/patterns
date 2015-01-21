package networkmanager;

/**
 * Created by ender on 21/01/15.
 */
public interface IUserManager {

    Session authorize(String mail, String pass);

}
