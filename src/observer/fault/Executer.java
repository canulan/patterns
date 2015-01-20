package observer.fault;

import observer.fault.handlers.AlarmHandler;
import observer.fault.handlers.MailHandler;
import observer.fault.handlers.Priority;

/**
 * Created by ender on 20/01/15.
 */
public class Executer {

    public static void main(String[] args) {
        FaultManager faultManager = new FaultManager();

        MailHandler mailHandler = new MailHandler(faultManager);
        mailHandler.setPriority(Priority.HIGH);
        AlarmHandler alarmHandler = new AlarmHandler(faultManager);

        faultManager.handle(new Exception("Exception occured.."));

    }
}
