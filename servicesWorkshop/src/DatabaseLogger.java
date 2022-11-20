public class DatabaseLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Logged to database");
    }
}
