package networkmanager;

/**
 * Created by ender on 21/01/15.
 */
public class NetworkProxy implements INetworkManager {

    private INetworkManager network;

    public NetworkProxy(INetworkManager network) {
        this.network = network;
    }

    // 1. Before, after
    // 2. Stop/Continue

    @Override
    public Session createSession(String mail, String pass) {
        // Before
        return network.createSession(mail, pass);
        // After
    }

    @Override
    public void connect(Session session, String url) {
        // Before
        network.connect(session, url);
        // After
    }
}
