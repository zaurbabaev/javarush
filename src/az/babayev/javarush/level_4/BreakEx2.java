package az.babayev.javarush.level_4;

import java.util.Scanner;

public class BreakEx2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите свой возраст: ");
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                if (age > 0) {
                    System.out.println("Отлично! Ваш возраст: " + age);
                    break;
                } else {
                    System.out.println("Ошибка! Введите положительный возраст.");
                }
            } else {
                System.out.println("Ошибка! Введите число.");
                scanner.nextLine(); // съедаем некорректный ввод
            }
        }
    }
}
