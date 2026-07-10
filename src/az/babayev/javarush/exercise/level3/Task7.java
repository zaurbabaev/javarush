package az.babayev.javarush.exercise.level3;

import java.util.Scanner;

/*
Вы — организатор конференции и проверяете тип приглашения. Попросите пользователя ввести его возраст и код приглашения.
Если возраст больше или равен 21:
Если код — "VIP", выведите "Доступ к VIP-залу разрешен.".
Если код — "GUEST", выведите "Гостевой доступ разрешен.".
Иначе выведите "Неверный код приглашения.".
Если возраст меньше 21, выведите "К сожалению, только с 21 года.".
*/
public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Запрашиваем и считываем возраст пользователя
        System.out.println("Введите ваш возраст:");
        int age = Integer.parseInt(console.nextLine());

        // Запрашиваем и считываем код приглашения
        System.out.println("Введите код приглашения:");
        String code = console.nextLine().trim();

        // Вложенная логика: сначала проверяем возраст, затем код
        if (age >= 21) {
            // Возраст подходит — проверяем тип приглашения
            if (code.equalsIgnoreCase("VIP")) {
                System.out.println("Доступ к VIP-залу разрешен.");
            } else if (code.equalsIgnoreCase("GUEST")) {
                System.out.println("Гостевой доступ разрешен.");
            } else {
                System.out.println("Неверный код приглашения.");
            }
        } else {
            // Возраст меньше 21 — доступ запрещен
            System.out.println("К сожалению, только с 21 года.");
        }
    }
}






























