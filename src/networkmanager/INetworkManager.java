package networkmanager;

/**
 * Created by ender on 21/01/15.
 */
public interface INetworkManager {

    Session createSession(String mail, String pass);

    public void connect(Session session, String url);

}
