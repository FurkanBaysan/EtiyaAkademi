public class EmailLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("email sent");
    }
}
