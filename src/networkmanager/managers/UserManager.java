package networkmanager.managers;

import networkmanager.Session;
import networkmanager.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ender on 21/01/15.
 */
public class UserManager implements IUserManager {

    // Db
    private Map<String, User> users = new HashMap<>();

    public UserManager() {
        users.put("ahmet@turkcell.com.tr", new User("ahmet@turkcell.com.tr", "123"));
        users.put("ayse@turkcell.com.tr", new User("ayse@turkcell.com.tr", "123"));
        users.put("ali@turkcell.com.tr", new User("ali@turkcell.com.tr", "123"));
    }

    @Override
    public Session authorize(String mail, String pass) {
        User user = users.get(mail);
        if (user == null) {
            throw new RuntimeException("Invalid user.");
        }
        boolean authorized = pass.equals(user.getPass());
        if (!authorized) {
            throw new RuntimeException("Invalid user or password.");
        }
        return new Session(user);
    }


}
