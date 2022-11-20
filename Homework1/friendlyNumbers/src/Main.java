import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 220 - 284,  17296 - 18416, 1184 - 1210
        System.out.println("Please enter the first positive integer for the Friendly Numbers pair checking : ");
        int a = scanner.nextInt();
        System.out.println("Please enter the second positive integer for the Friendly Number pair checking : ");
        int b = scanner.nextInt();

        int counta = 0;
        int countb = 0;

        boolean areFriendlyNumbers = false;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                counta = counta + i;
            }
        }
        for (int j = 1; j < b; j++) {
            if (b % j == 0) {
                countb = countb + j;
            }
        }
        if (counta == b && countb == a) {
            areFriendlyNumbers = true;
        }

        if (areFriendlyNumbers) {
            System.out.println(a + " and " + b + " are Friendly Numbers :)");
        } else {
            System.out.println(a + " and " + b + " are NOT Friendly Numbers :(");
        }
    }
}