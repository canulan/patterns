package networkmanager;

import networkmanager.listener.InvokeType;

/**
 * Created by ender on 22/01/15.
 */
public class ConnectInfo {

    private final Session session;
    private final String url;

    public ConnectInfo(Session session, String url) {
        this.session = session;
        this.url = url;
    }

    public Session session() {
        return session;
    }

    public String url() {
        return url;
    }

}
