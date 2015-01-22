package networkmanager;

import networkmanager.listener.INetworkListener;
import networkmanager.listener.InvokeType;
import networkmanager.listener.Listener;
import networkmanager.managers.INetworkManager;

import java.util.*;

/**
 * Created by ender on 21/01/15.
 */
public class NetworkProxy implements INetworkManager {

    private INetworkManager network;
    private Map<InvokeType, List<INetworkListener>> listeners = new HashMap<>();

    public NetworkProxy(INetworkManager network) {
        this.network = network;
    }


    public void findListeners() throws Exception {
        // Find all classes from file system
        // Load classes
        // Find annotated classes
        List<Class<?>> list = new ArrayList<>(); // Annotated classes
        for (Class<?> cls : list) {
            Listener annotation = cls.getAnnotation(Listener.class);
            InvokeType[] types = annotation.value();
            for (InvokeType type : types) {
                registerListener((INetworkListener) cls.newInstance(), type);
            }
        }
    }

    public void registerListener(INetworkListener listener, InvokeType invoke, InvokeType... others) {
        List<InvokeType> invokeTypes = Arrays.asList(others);
        invokeTypes.add(invoke);
        addListeners(listener, invokeTypes);
    }

    private void addListeners(INetworkListener listener, List<InvokeType> types) {
        for (InvokeType type : types) {
            List<INetworkListener> list = listeners.get(type);
            if (list == null) {
                list = new ArrayList<>();
                listeners.put(type, list);
            }
            list.add(listener);
        }
    }

    @Override
    public ISession createSession(String mail, String pass) {
        ISession session = null;
        try {
            session = network.createSession(mail, pass);
        } catch (Exception e) {
        }
        return session;
    }

    @Override
    public void connect(Session session, String url) {
        ConnectInfo info = new ConnectInfo(session, url);
        //
        callInvokes(InvokeType.BEFORE, info);
        try {
            network.connect(session, url);
        } catch (Exception e) {
            callInvokes(InvokeType.THROWS, info);
        }
        callInvokes(InvokeType.AFTER, info);
    }


    private void callInvokes(InvokeType type, ConnectInfo info) {
        List<INetworkListener> list = listeners.get(type);
        for (INetworkListener listener : list) {
            try {
                boolean success = listener.connecting(type, info);
                if (!success) {
                    return;
                }
            } catch (Exception e) {
                // Logging
            }
        }
    }

}
