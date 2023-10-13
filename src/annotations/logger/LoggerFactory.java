package annotations.logger;

public class LoggerFactory {
    public static Logger getLogger(final Class<?> type) {
        return new Logger(type.getName());
    }
}
