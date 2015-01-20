package observer.fault;

import observer.fault.handlers.AlarmHandler;
import observer.fault.handlers.MailHandler;

/**
 * Created by ender on 20/01/15.
 */
public class Executer {

    public static void main(String[] args) {
        FaultManager faultManager = new FaultManager();

        new MailHandler(faultManager);
        new AlarmHandler(faultManager);

        faultManager.handle(new Exception("Exception occured.."));

    }
}
