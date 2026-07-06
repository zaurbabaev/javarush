package az.babayev.javarush.level_3.lection1;

public class Task3 {
    static void main() {
        int hour = 13;
        if (hour < 12) {
            System.out.println("Доброе утро!");
        } else if (hour < 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }
    }
}
