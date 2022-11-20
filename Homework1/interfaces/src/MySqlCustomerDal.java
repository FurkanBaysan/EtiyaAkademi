public class MySqlCustomerDal implements ICustomerDal {
    @Override
    public void add(Customer customer) {
        System.out.println(customer.customerNumber + " added to MySQL");
    }
}
