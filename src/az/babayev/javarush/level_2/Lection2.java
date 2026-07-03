package az.babayev.javarush.level_2;

public class Lection2 {
    static void main() {

        String name = "Anya";
        String city = "New York";
        String message = "Hello!";

        String quote = "Он сказал: \"Здравствуйте!\"";
        System.out.println(quote);

        String name2 = "Андрей";
        int length = name2.length();
        System.out.println(length);

        String original = "Привет";
        System.out.println(original.toUpperCase()); // ПРИВЕТ
        System.out.println(original.toLowerCase()); // привет

        String messy = "   hello   ";
        System.out.println(messy.trim()); // "hello"
    }
}
