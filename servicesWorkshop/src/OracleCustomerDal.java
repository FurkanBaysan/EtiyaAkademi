import java.util.*;

public class OracleCustomerDal implements ICustomerDal {
    List<Customer> customers = new ArrayList<>();
    private Customer customer;

    @Override
    public void add(Customer customer) {
        System.out.println(customer.customerNumber + " added to Oracle database");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.customerNumber + " deleted from Oracle database");
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.customerNumber + " updated in the  Oracle database");
    }

    @Override
    public List<Customer> getAll() {
        return new ArrayList<Customer>();
    }

    @Override
    public Customer getById(Customer customer) {
        return new Customer(customer.id, "5678");
    }
}
