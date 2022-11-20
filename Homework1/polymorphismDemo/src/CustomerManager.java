public class CustomerManager {
    private BaseLogger logger; // -> Composition
    // BaseLogger[] loggers;

    public CustomerManager() {

    }

    // Third Way ( Dependency Injection )
    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    // Same logic with the Third Way, but in this scenario, we want to log with multiple logging alternatives/methods
    /*public CustomerManager(BaseLogger[] loggers) {
        this.loggers = loggers;
    }*/

    // First Way
    /*public void add(Customer customer, BaseLogger logger) {
        System.out.println(customer.customerNumber + " added to the database");
        logger.log("Log Message");
    }*/

    // Same logic with the First Way, but in this scenario, we want to log with multiple logging alternatives/methods
        /*public void add(Customer customer, BaseLogger[] loggers) {
            System.out.println(customer.customerNumber + " added to the database");

            for (BaseLogger logger : loggers) {
                logger.log("Log Message");
            }

        }*/

    // Second Way
        /*public void add(Customer customer) {
            System.out.println(customer.customerNumber + " added to the database");
            this.logger.log("Log Message");
        }*/


    // Third Way
    public void add(Customer customer) {
        System.out.println(customer.customerNumber + " added to the database");
        this.logger.log("Log Message");
    }


    // Same logic with the Third Way, but in this scenario, we want to log with multiple logging alternatives/methods
    /*public void add(Customer customer) {
        System.out.println(customer.customerNumber + " added to the database");

        for (BaseLogger logger : this.loggers) {
            logger.log("Log Message");
        }

    }*/

}
