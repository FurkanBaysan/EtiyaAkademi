import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel!";
        System.out.println(message);
        System.out.println("Karakter sayısı : " + message.length());
        int index = 6;
        char indexofch = message.charAt(index);
        System.out.println(MessageFormat.format("{0}. Karakter : {1}", index + 1, indexofch));
        System.out.println("toUpperCase : " + message.toUpperCase());
        System.out.println("toLowerCase : " + message.toLowerCase());
        var ch = 'ü';
        int firstIndex = message.indexOf(ch);
        int lastIndexOf = message.lastIndexOf(ch);
        int lastIndex = message.length() - firstIndex - 1;
        int lastIndexPosition = message.length() - message.lastIndexOf(ch) - 1;
        // first way to add variables in a string
        // System.out.printf("Index of %s : %s%n", ch, firstIndex);
        // second way to add variables in a string
        System.out.println(MessageFormat.format("Index position of {0} : {1}", ch, firstIndex));
        System.out.println(MessageFormat.format("First Index position of {0} from the end : {1}", ch, lastIndex));
        System.out.println(MessageFormat.format("Last Index position of {0} from the beginning: {1}", ch, lastIndexOf));
        System.out.println(MessageFormat.format("Last Index position of {0} from the end : {1}", ch, lastIndexPosition));
        String message2 = message.concat(" Değil mi?");
        System.out.println("Concatenated message :" + message2);
        System.out.println(message);
        System.out.println("startsWith : " + message.startsWith("ha", 6));
        System.out.println("endsWith : " + message.endsWith("el!"));
        char[] karakterler = new char[5];
        message.getChars(0, 5, karakterler, 0);
        // append method to append the char array after a string
//        StringBuilder str = new StringBuilder("getChars : ");
//        str.append(karakterler);
//        System.out.println(str);

        // easier alternative

        System.out.println("getChars : " + String.valueOf(karakterler));


        System.out.println("replaced string : " + message.replace(" ", "-"));
        System.out.println(message);
        String message3 = message.replace(" ", "-");
        System.out.println(message3);
        System.out.println("subString : " + message.substring(3));
        System.out.println("substring 2 : " + message.substring(6, 10));

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        String messageTrim = "     Bugün   hava    çok   güzel     ";
        System.out.println("With spaces : " + messageTrim);
        System.out.println("Spaces are deleted by trim() function (only first and last spaces are deleted) : " + messageTrim.trim());
    }
}