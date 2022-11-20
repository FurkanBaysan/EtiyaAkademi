public class Main {
    public static void main(String[] args) {
        double dolarDun = 18.54;
        double dolarBugun = 18.34;

        if (dolarBugun > dolarDun) {
            System.out.println("Yukarı Ok");
        } else if (dolarBugun == dolarDun) {
            System.out.println("Eşit Ok");
        } else {
            System.out.println("Aşağı Ok");
        }

    }
}