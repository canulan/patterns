package observer.fault.handlers;

import observer.fault.Fault;
import observer.fault.FaultManager;

import java.util.concurrent.TimeUnit;

/**
 * Created by ender on 20/01/15.
 */
public class MailHandler extends AbstractHandler {

    public MailHandler(FaultManager manager) {
        super(manager);
    }

    @Override
    public void handle(Fault fault) {
        // Send mail...
        try {
            Thread.sleep(TimeUnit.HOURS.toMillis(1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
