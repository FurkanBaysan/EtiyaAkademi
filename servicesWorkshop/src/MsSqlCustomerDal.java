import java.util.ArrayList;
import java.util.List;

public class MsSqlCustomerDal implements ICustomerDal {
    List<Customer> customers = new ArrayList<>();
    Customer customer;

    @Override
    public void add(Customer customer) {
        System.out.println(customer.customerNumber + " added to MsSql database");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.customerNumber + " deleted from the MsSql database");
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.customerNumber + " updated in the MsSql database");
    }

    @Override
    public List<Customer> getAll() {
        return new ArrayList<Customer>();
    }

    @Override
    public Customer getById(Customer customer) {
        return new Customer();
    }
}
