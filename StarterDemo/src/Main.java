public class Main {
    public static void main(String[] args) {

        System.out.println("\t" + "Variables");

        String firstName = "Furkan Baysan";
        String secondName = "Berat Kubilay";
        String thirdName = "Toprak Kaya";
        String text = "Detayli Bilgi Icin Tiklayiniz";

        // String Concatenation
        System.out.println(firstName + " " + secondName);

        int firstNumber = 20;
        int secondNumber = 10;
        int thirdNumber = 30;

        double dolarDun = 18.54;
        double dolarBugun = 18.34;
        // We can also hold type of fractional number data, using with float variable type

        System.out.println("\t" + "Arithmetic Operators");

        int addResult = firstNumber + secondNumber;
        int subResult = firstNumber - secondNumber;
        int mulResult = firstNumber * secondNumber;
        int divResult = firstNumber / secondNumber;
        int modResult = firstNumber % secondNumber;

        System.out.println(addResult);
        System.out.println(subResult);
        System.out.println(mulResult);
        System.out.println(divResult);
        System.out.println(subResult);

        //  Variable Need
        int totalResult = addResult + thirdNumber;
        System.out.println(totalResult);

        System.out.println("\t" + "Comparison Operators");

        System.out.println(dolarDun >= dolarBugun); //false
        System.out.println(dolarDun <= dolarBugun); // true
        System.out.println(dolarDun == dolarBugun); // false
        System.out.println(dolarDun != dolarBugun); // true

        boolean isLogged = false;

        // Assignment Operators -> =, +=, -=, *=, /=, %=
        // Logical Operators -> && , || , ! => These are using in if statements generally.


        System.out.println();

        System.out.println("\t" + "Conditional Blocks");

        if (dolarBugun > dolarDun) {
            System.out.println("Yukarı Ok");
        } else if (dolarBugun == dolarDun) {
            System.out.println("Eşit Ok");
        } else {
            System.out.println("Aşağı Ok");
        }

        System.out.println();


        System.out.println("\t" + "Switch Statement");
        //It's equivalent of if statement

        String status = "A";
        // A represents Siparis Alındı
        // B represents  Siparis Teslim Edildi
        // C represents Sipariş Kargoda

        switch (status) {
            case "A":
                System.out.println("Sipariş Alındı");
                break;
            case "B":
                System.out.println("Sipariş Teslim Edildi");
                break;
            case "C":
                System.out.println("Sipariş Kargoda");
                break;
            default:
                System.out.println("Sipariş Diye Bir şey bize ulaşmadı");
                break;
        }

        System.out.println();


        System.out.println("\t" + "Arrays and Loops");

        //  Array veya Array türevi (List,ArrayList,Hashmap,Linked -List) bir yapı varsa, döngü vardır.

        String[] krediler = {"Hizli Kredi", "Mutlu Emekli Kredisi", "İhtiyac Kredisi", "Tasit Kredisi", "Araba Kredisi", "Emekli Kredisi"};
        // krediler -> reference, object referer.

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }

    }
}