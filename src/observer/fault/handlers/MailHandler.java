package observer.fault.handlers;

import observer.fault.Fault;
import observer.fault.FaultManager;
import observer.fault.IHandler;

/**
 * Created by ender on 20/01/15.
 */
public class MailHandler implements IHandler {

    public MailHandler(FaultManager manager) {
        manager.register(this);
    }

    @Override
    public void handle(Fault fault) {
        // Send mail...
    }
}
