package observer.fault;

import observer.fault.handlers.Priority;

/**
 * Created by ender on 20/01/15.
 */
public interface IHandler extends Comparable<IHandler>{

    void handle(Fault fault) throws Exception;

    Priority priority();

    void setPriority(Priority priority);

}
