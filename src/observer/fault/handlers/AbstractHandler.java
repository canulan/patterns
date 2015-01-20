package observer.fault.handlers;

import observer.fault.FaultManager;
import observer.fault.IHandler;

/**
 * Created by ender on 20/01/15.
 */
public abstract class AbstractHandler implements IHandler, Comparable<IHandler> {

    private Priority priority = Priority.MEDIUM;

    public AbstractHandler(FaultManager manager) {
        manager.register(this);
    }

    @Override
    public final void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public final Priority priority() {
        return priority;
    }

    private int priorityValue() {
        return priority.ordinal();
    }

    @Override
    public int compareTo(IHandler o) {
        return ((AbstractHandler)o).priorityValue() - priorityValue();
    }
}
