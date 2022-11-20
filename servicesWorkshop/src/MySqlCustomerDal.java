import java.util.ArrayList;
import java.util.List;

public class MySqlCustomerDal implements ICustomerDal {
    @Override
    public void add(Customer customer) {
        System.out.println(customer.customerNumber + " added to the database");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.customerNumber + " removed from  the database");
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.customerNumber + " updated in the database");
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
