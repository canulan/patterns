package templatemethod.modules.parts;

import templatemethod.modules.IDbService;
import templatemethod.modules.ILoggingService;
import templatemethod.modules.fw.BaseModule;

/**
 * Created by ender on 22/01/15.
 */
public class Client {

    public Client(BaseModule.Services services) {
        IDbService service = services.getService(IDbService.class);
        ILoggingService logging = services.getService(ILoggingService.class);
    }
}
