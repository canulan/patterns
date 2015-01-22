package modular.modules;

import modular.Context;
import modular.IModule;

/**
 * Created by ender on 22/01/15.
 */
public class MyModule implements IModule {

    private DbService dbService;

    @Override
    public void start(Context context) {
        dbService = new DbService();
        context.registerService(IDbService.class, dbService);
    }

    @Override
    public void stop(Context context) {
        context.unregisterService(dbService);
    }

}
