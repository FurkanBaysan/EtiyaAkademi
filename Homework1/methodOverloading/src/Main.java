public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int additionResult = calculator.addition(2, 3);
        System.out.println(additionResult);
        int result = calculator.addition(2, 3, 5);
        System.out.println(result);
    }
}