package observer.fault;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ender on 20/01/15.
 */
public class FaultManager {

    private List<IHandler> handlers = new ArrayList<IHandler>();

    private static final int THREAD_COUNT = 5;
    private ExecutorService executor;

    public FaultManager() {
        executor = Executors.newFixedThreadPool(THREAD_COUNT);
    }

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
        for (IHandler handler : handlers) {
            executor.execute(new HandlerTask(handler, fault));
        }
    }

    class HandlerTask implements Runnable {

        private final IHandler handler;
        private final Fault f;

        public HandlerTask(IHandler handler, Fault f) {
            this.handler = handler;
            this.f = f;
        }

        @Override
        public void run() {
            try {
                handler.handle(f);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
