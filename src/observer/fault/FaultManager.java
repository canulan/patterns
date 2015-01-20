package observer.fault;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ender on 20/01/15.
 */
public class FaultManager {

    private List<IHandler> handlers = new ArrayList<IHandler>();

    public void register(IHandler handler) {
        handlers.add(handler);
    }

    public void unregister(IHandler handler) {
        handlers.remove(handler);
    }

    public void handle(Exception e) {
        // Send exception to registered handlers
        Fault fault = new Fault(e);
        Collections.sort(handlers);
        for(IHandler handler:handlers) {
            try {
                System.out.println("Sending fault to " + handler);
                handler.handle(fault);
            } catch (Exception ex) {
                // Logging exception
            }
        }
    }

}
