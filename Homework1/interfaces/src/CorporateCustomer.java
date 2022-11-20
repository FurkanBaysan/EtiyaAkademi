public class CorporateCustomer extends Customer {
    public String companyName;
    public int taxNumber;

    public CorporateCustomer() {

    }

    public CorporateCustomer(int id, String customerNumber) {
        super(id, customerNumber);
    }
}
