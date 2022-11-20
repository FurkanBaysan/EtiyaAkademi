public class CustomerManager {
    // Strategy Pattern
    public BaseDatabaseManager baseDatabaseManager;

    public void getCustomers() {
        this.baseDatabaseManager.getData();
    }
}
