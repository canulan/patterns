package modular.modules;

import modular.Context;
import modular.IModule;

/**
 * Created by ender on 22/01/15.
 */
public class MyModule implements IModule {

    private DbService dbService;
    private QueryService queryService;

    @Override
    public void start(Context context) {
        dbService = new DbService();
        context.registerService(IDbService.class, dbService);

        queryService = new QueryService();
        context.registerService(IQueryService.class, queryService);

        ILoggingService logService = context.getService(ILoggingService.class);
    }

    @Override
    public void stop(Context context) {
        context.unregisterService(dbService);
    }

}
