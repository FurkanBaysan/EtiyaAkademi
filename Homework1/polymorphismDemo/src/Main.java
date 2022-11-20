public class Main {
    public static void main(String[] args) {
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.customerNumber = "1234";

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.customerNumber = "5678";

        // First Way

        /*BaseLogger baseLogger = new EmailLogger(); // -> Polymorphism
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(customer, baseLogger);*/


        // Same logic with the First Way, but in this scenario, we want to log with multiple logging alternatives/methods

        /*BaseLogger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()}; // -> Polymorphism
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(customer, loggers);*/

        // Second Way

        /*CustomerManager customerManager=new CustomerManager();
         customerManager.logger = databaseLogger; // -> Polymorphism
         customerManager.add(customer);*/

        // Third Way

        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add(individualCustomer);


        //Same logic with the Third Way, but in this scenario, we want to log with multiple logging alternatives/methods

        /*
        BaseLogger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};
        CustomerManager manager = new CustomerManager(loggers);
        manager.add(corporateCustomer);
*/

    }
}