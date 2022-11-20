public class Main {
    public static void main(String[] args) {
        //  Case 1
        int firstNumber = 10;
        int secondNumber = 20;
        secondNumber = firstNumber;
        firstNumber = 30;
        System.out.println(secondNumber);

        // Case 1->   everything starts and ends on the stack in the RAM.

        //  Case 2
        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{4, 5, 6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);

        //  Case 2 -> Referer numbers1 says to referer numbers2, you hold the same place in RAM as I do.
        //  Namely, both referers (numbers2 and numbers1) point to the same array (same array object) in RAM.
        //  So a change with one affects the other.

    }
}