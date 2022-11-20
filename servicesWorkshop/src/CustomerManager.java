public class CustomerManager {
    private ICustomerDal customerDal;
    private ILogger[] loggers;

    public CustomerManager(ICustomerDal customerDal, ILogger[] loggers) {
        this.customerDal = customerDal;
        this.loggers = loggers;
    }

    public void add(Customer customer) {
        this.customerDal.add(customer);

        for (ILogger logger : loggers) {
            logger.log();
        }

    }

}
