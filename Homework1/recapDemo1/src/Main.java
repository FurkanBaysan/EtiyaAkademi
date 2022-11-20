public class Main {
    public static void main(String[] args) {
        int firstNumber = 82;
        int secondNumber = 19;
        int thirdNumber = 18;

        int greatestNumber = firstNumber;

        if (secondNumber > greatestNumber) {
            greatestNumber = secondNumber;
        }
        if (thirdNumber > greatestNumber) {
            greatestNumber = thirdNumber;
        }

        System.out.println("Greatest Number: " + greatestNumber);

    }
}