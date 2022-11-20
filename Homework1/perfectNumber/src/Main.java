import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a positive integer to check whether it's a Perfect Number or not : ");
        int number = scanner.nextInt();

        boolean isPerfectNumber = false;

        int count = 0;

        if (number < 1) {
            System.out.println("Invalid Number. Entered number should be a positive integer to be checked.");
            return;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count = count + i;
            }
        }

        if (count == number || number == 1) {
            isPerfectNumber = true; // The first few perfect numbers are 6, 28, 496 and 8128.
        }

        if (isPerfectNumber) {
            System.out.println(number + " is a Perfect Number :)");
        } else {
            System.out.println(number + " is NOT a Perfect Number :(");
        }

    }
}