import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4JExample {
    private static final Logger LOGGER = Logger.getLogger(Log4JExample.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
//        LOGGER.info("Initializing Log4JExample application");
//        final Logger logger = Logger.getLogger(Log4JExample.class);
        LOGGER.error("Error log");
//        LOGGER.debug("Debug log");
    }
}
