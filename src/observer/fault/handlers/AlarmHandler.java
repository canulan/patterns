package observer.fault.handlers;

import observer.fault.Fault;
import observer.fault.FaultManager;

/**
 * Created by ender on 20/01/15.
 */
public class AlarmHandler extends AbstractHandler {

    public AlarmHandler(FaultManager manager) {
        super(manager);
    }

    @Override
    public void handle(Fault fault) {
        // Send alarm..
        throw new RuntimeException();
    }

}
