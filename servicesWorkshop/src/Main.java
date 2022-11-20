

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "1234");
        ILogger[] loggers = {new DatabaseLogger(), new FileLogger(),new EmailLogger()};
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal(), loggers);
        customerManager.add(customer);
    }
}