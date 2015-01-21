package networkmanager;

/**
 * Created by ender on 21/01/15.
 */
public class NetworkManager implements INetworkManager {

    private IUserManager users;

    public NetworkManager(IUserManager users) {
        this.users = users;
    }

    @Override
    public Session createSession(String mail, String pass) {
        return users.authorize(mail, pass);
    }

    @Override
    public void connect(Session session, String url) {
        System.out.println("Connecting to " + url + " Session:" + session);
    }

}
