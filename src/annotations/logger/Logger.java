package annotations.logger;

public class Logger {
    public String className;
    Logger(String className) {
        this.className = className;
    }
    public void info(String log) {
        System.out.println(className + ": " + log);
    }
}
