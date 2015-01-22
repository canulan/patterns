package networkmanager.listener;

import networkmanager.ConnectInfo;

/**
 * Created by ender on 22/01/15.
 */
@Listener({InvokeType.BEFORE, InvokeType.THROWS})
public class AuthorizationListener implements INetworkListener {

    @Override
    public boolean connecting(InvokeType type, ConnectInfo info) {
        if (info.session().mail().equals("ender")) {
            return false;
        }
        return true;
    }
}
