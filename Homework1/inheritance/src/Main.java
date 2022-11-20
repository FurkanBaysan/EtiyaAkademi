public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        // Inheritance
        customer.setFirstName("Furkan");
        customer.setLastName("Baysan");
        customer.setAge(25);

        System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + customer.getAge());

        employee.setFirstName("Velihan");
        employee.setLastName("Gozek");
        employee.setAge(24);

        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getAge());

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.add(employee);

        CustomerManager customerManager = new CustomerManager();
        customerManager.add(customer);

        // Not about Inheritance
        employee.setSalary(10000);
        System.out.println(employee.getSalary());
        customer.setEmail("furkanbaysan@hotmail.com");
        System.out.println(customer.getEmail());

        employeeManager.getBestEmployee();


    }
}