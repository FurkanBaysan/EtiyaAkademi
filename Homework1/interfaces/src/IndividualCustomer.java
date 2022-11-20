import java.time.LocalDate;

public class IndividualCustomer extends Customer {
    public String nationalIdentity;
    public String firstName;
    public String lastName;
    public LocalDate birthDate;

    public IndividualCustomer() {

    }

    public IndividualCustomer(int id, String customerNumber) {
        super(id, customerNumber);
    }
}
