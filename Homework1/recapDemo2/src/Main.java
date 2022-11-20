public class Main {
    public static void main(String[] args) {
        // double[] numbers = new double[4]; --> Alternative way below;
        double[] numbers = {6.2, 5.1, 8.7, 7.5}; // 4 elements.
        double total = 0;
        double greatestNumber = numbers[0];

        for (double number : numbers) {
            if (number > greatestNumber) {
                greatestNumber = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("The Greatest Number : " + greatestNumber);
        System.out.println("Total is : " + total);

    }
}