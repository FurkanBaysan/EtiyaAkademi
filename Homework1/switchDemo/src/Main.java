public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Student has passed successfully with grade A!");
                break;
            case 'B':
                System.out.println("Student has passed with the grade B!");
                break;
            case 'C':
                System.out.println("Student has passed with the grade C!");
            case 'D':
                System.out.println("Student has passed with the grade D!");
            case 'F':
                System.out.println("Student has failed!");
                break;
            default:
                System.out.println("Geçersiz Not"); //default case has not a break.
        }
    }
}