public class PersonManager {
    public void list() {
        System.out.println("Persons listed");
    }

    public void add(Person person) {
        System.out.println(person.getFirstName() + " " + person.getLastName() + " " + "added to the database");
    }
}
