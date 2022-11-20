import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = {3, 20, 15, 89, 64};
        System.out.println("Please enter the wanted number to find if it exists in the list : ");
        int wanted = scanner.nextInt();

        boolean wantedExists = false;

        for (int number : numbers) {
            if (wanted == number) {
                wantedExists = true;
                break;
            }
        }

        if (wantedExists) {
            System.out.println(wanted + " exists in the list :)");
        } else {
            System.out.println(wanted + " does NOT exist in the list :(");
        }
    }
}