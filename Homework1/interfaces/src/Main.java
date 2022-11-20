public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        IndividualCustomer individualCustomer = new IndividualCustomer(1, "1234");
        CorporateCustomer corporateCustomer = new CorporateCustomer(2, "5678");
        customerManager.add(individualCustomer);
    }
}