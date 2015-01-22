package templatemethod.modules;

import templatemethod.modules.fw.BaseModule;
import templatemethod.modules.parts.Client;

/**
 * Created by ender on 22/01/15.
 */
public class MyModule extends BaseModule {

    private DbService dbService;
    private QueryService queryService;



    public MyModule() {
    }

    @Override
    protected Class[] getServices() {
        return new Class[]{ILoggingService.class};
    }

    @Override
    protected Pair[] getRegisterServices() {
        return new Pair[]{//
                Pair.of(IDbService.class, dbService), //
                Pair.of(IQueryService.class, queryService)};
    }

    @Override
    public void start() {
        new Client(services);
    }


}
