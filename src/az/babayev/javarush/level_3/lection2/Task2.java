package az.babayev.javarush.level_3.lection2;

import java.util.Scanner;

public class Task2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 21) {
            System.out.print("Введите пригласительный код: ");
            String code = scanner.nextLine();
            if (code.equals("VIP2024")) {
                System.out.println("Добро пожаловать в клуб!");
            } else if (code.equals("GUEST")) {
                System.out.println("Гостевой режим: доступ только до 23:00.");
            } else {
                System.out.println("Увы, доступ невозможен.");
            }
        } else {
            System.out.println("Вход только с 21 года.");
        }

        scanner.close();
    }
}
