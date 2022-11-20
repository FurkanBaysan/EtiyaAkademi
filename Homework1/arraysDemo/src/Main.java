public class Main {
    public static void main(String[] args) {
        String firstStudent = "Furkan";
        String secondStudent = "Anil";
        String thirdStudent = "Burak";

        System.out.println(firstStudent);
        System.out.println(secondStudent);
        System.out.println(thirdStudent);

        System.out.println("Brute Force approach is done!");
        // ALTERNATIVE

        String[] students = new String[3];
        students[0] = "Velihan";
        students[1] = "Anil";
        students[2] = "Burak";
        // students[3] = "Melisa"; index 3 out of bounds for length 3 --> length should be 4.

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println("For loop ended!");

        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("students array traverse is done via foreach!");
    }
}