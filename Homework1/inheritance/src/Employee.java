public class Employee extends Person {
    private double salary;

    public Employee() {

    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
