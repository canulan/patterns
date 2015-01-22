package networkmanager.managers;

import networkmanager.ISession;
import networkmanager.Session;

/**
 * Created by ender on 21/01/15.
 */
public interface INetworkManager {

    ISession createSession(String mail, String pass);

    public void connect(Session session, String url);

}
