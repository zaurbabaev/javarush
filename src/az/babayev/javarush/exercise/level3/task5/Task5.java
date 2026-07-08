package az.babayev.javarush.exercise.level3.task5;

import java.util.Scanner;

public class Task5 {
    static void main() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int age = Integer.parseInt(console.nextLine());

        if (age >= 18) {
            System.out.println("Введите секретный код: ");
            String secretCode = console.nextLine();
            if (secretCode.equals("OPEN")) {
                System.out.println("Вход разрешен!");
            } else {
                System.out.println("Вам сегодня не повезло, вход запрещен.");
            }
        } else {
            System.out.println("Вам сегодня не повезло, вход запрещен.");
        }
    }
}
