public class FileLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Logged to file");
    }
}
