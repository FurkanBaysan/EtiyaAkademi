public class Customer extends Person {
    private String email;

    public Customer() {

    }

    public Customer(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
