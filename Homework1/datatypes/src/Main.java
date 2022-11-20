public class Main {
    public static void main(String[] args) {
        double number = 12.4;
        // number = "Ankara"; Can't be done because there are incompatible types.
        number = -129;

        String course = "Object-Oriented Programming with Java";
        char character = 'f'; //holds the character's ascii code.

        boolean isLogged = true;
        //isLogged = false;

        if (isLogged) //if inside the brackets == true, the block will be run.
        {
            System.out.println("The user has logged into the system");
        } else {
            System.out.println("The user is not logged into the system");
        }
    }
}