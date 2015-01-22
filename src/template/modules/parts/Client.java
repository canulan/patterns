package template.modules.parts;

import template.modules.IDbService;
import template.modules.ILoggingService;
import template.modules.fw.BaseModule;

/**
 * Created by ender on 22/01/15.
 */
public class Client {

    public Client(BaseModule.Services services) {
        IDbService service = services.getService(IDbService.class);
        ILoggingService logging = services.getService(ILoggingService.class);
    }
}
