public class CustomerManager {
    public void add(Customer customer) {
        System.out.println(customer.getCustomerNumber() + " " + "added to the database");
    }

    public void remove(Customer customer) {
        System.out.println(customer.getCustomerNumber() + " " + "removed from the database");
    }

    public void update(Customer customer) {
        System.out.println(customer.getCustomerNumber() + " " + "updated in the database");
    }
}
