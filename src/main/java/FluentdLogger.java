import org.fluentd.logger.FluentLogger;

import java.util.HashMap;
import java.util.Map;

public class FluentdLogger {
    private static FluentLogger LOG = FluentLogger.getLogger("mongo.test", "127.0.0.1", 24224);
    public static void main(String args[]) {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("from", "userA");
        data.put("to", "userB");
        LOG.log("follow", data);
    }
}
