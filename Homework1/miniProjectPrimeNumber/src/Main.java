import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a positive integer to find whether it's a Prime number or not");
        int number = scanner.nextInt();

        boolean isPrime = true; // flag variable

        if (number < 1) {
            //isPrime = false;
            System.out.println("Entered number is invalid due to 'Prime Numbers starts from 2' Rule.");
            return;
        }

        if (number == 1) {
            System.out.println(number + " is NOT a Prime Number");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                //System.out.println(number + " is NOT a Prime Number!");
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number!");
        } else {
            System.out.println(number + " is NOT a Prime Number!");
        }
    }
}
