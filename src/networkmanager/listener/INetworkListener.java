package networkmanager.listener;

import networkmanager.ConnectInfo;

/**
 * Created by ender on 22/01/15.
 */
public interface INetworkListener {

    boolean connecting(InvokeType type, ConnectInfo info);

}
