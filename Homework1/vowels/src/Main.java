import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a letter : ");
        char letter = scanner.next().charAt(0);

        boolean isVowel = false;

        char[] vowels = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü', 'A', 'E', 'I', 'İ', 'O', 'Ö', 'U', 'Ü'};
        for (char character : vowels) {
            if (character == letter) {
                isVowel = true;
                break;
            }
        }

        if (isVowel) {
            System.out.println("Entered letter is a vowel!");
        } else {
            System.out.println("Entered letter is a consonant!");
        }

        // Alternative way with Switch Block

        // toLowerCase would be useful here.

        char harf = 'A';
        //Enhanced Switch
        /*switch (harf) {
            case 'A', 'E', 'I', 'O' -> System.out.println("Letter is a vowel!");
            default -> System.out.println("Letter is a consonant!");
        }*/
    }
}