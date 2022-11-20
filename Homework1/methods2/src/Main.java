public class Main {
    public static void main(String[] args) {
        String message = "The weather is very nice today.";
        String resultString = message.substring(0, 3);
        // The substring(..) method returns a String. So, the resulting result should be kept with a variable of type String.
        System.out.println(resultString);
        int additionResult = addition(10, 20);
        System.out.println(additionResult);

        int result = addition(2, 3, 4, 5, 6, 8);
        System.out.println(result);
    }

    // void -> We are speaking in the imperative when we use this type of method. Do it, that's it. Don't return anything.
    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int addition(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public static int addition(int... numbers) {
        // int... numbers -> Variable Arguments
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
}