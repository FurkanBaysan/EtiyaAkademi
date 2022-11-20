public class Main {
    public static void main(String[] args) {
        findNumber();
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int desiredNumber = 5;
        boolean isAvailable = false;

        for (int i = 0; i < numbers.length; i++) {
            if (desiredNumber == numbers[i]) {
                isAvailable = true;
                break;
            }
        }

        if (isAvailable) {
            //System.out.println("Number is Available: " + desiredNumber); -> We put the instructions we want to run over and over into the method.
            printMessage("Number is Available: " + desiredNumber);
        } else {
            printMessage("Number is not Available: " + desiredNumber);
        }

    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}