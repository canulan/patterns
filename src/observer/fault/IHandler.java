package observer.fault;

/**
 * Created by ender on 20/01/15.
 */
public interface IHandler {

    void handle(Fault fault) throws Exception;

}
