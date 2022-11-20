public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        //  CustomerManager customerManager -> Object Referer, Reference
        //  new CustomerManager() -> Instantiation. i.e this is an instance, an object. By doing this, we are allocating space from memory.
        CustomerManager manager = new CustomerManager();

        customerManager = manager;
        //  After the above command, both customer Manager and manager object referers (references) now hold/point to the same memory location.
        //  Therefore, no matter which referer we access and call the add, delete and update actions/methods, the same action will be called and run.
        //  Since no referer holds/refers to the object the customerManager originally held, the garbage collector deletes it from RAM.

        Customer firstCustomer = new Customer(1, "1234");
        Customer secondCustomer = new Customer(2, "5678");

        customerManager.add(firstCustomer);
        customerManager.remove(firstCustomer);
        customerManager.update(secondCustomer);
    }
}