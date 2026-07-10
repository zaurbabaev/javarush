package az.babayev.javarush.exercise.level3;

import java.util.Scanner;

/*
Вы разрабатываете систему входа в эксклюзивный клуб. Попросите пользователя ввести его возраст и город.
Если возраст больше или равен 21, И при этом город — "Минск", выведите "Добро пожаловать в клуб, Минск!".
В противном случае выведите "Извините, вход запрещен.".
*/
public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите ваш возраст:");
        int age = Integer.parseInt(console.nextLine());

        System.out.println("Введите ваш город:");
        String city = console.nextLine();

        // Проверяем возраст
        if (age >= 21) {
            // Если возраст >= 21, проверяем город
            if (city.equals("Minsk")) {
                // Если город "Минск", выводим сообщение о доступе
                System.out.println("Добро пожаловать в клуб, Минск!");
            } else {
                // Если город не "Минск", выводим сообщение об отказе
                System.out.println("Извините, вход запрещен.");
            }
        } else {
            // Если возраст < 21, выводим сообщение об отказе
            System.out.println("Извините, вход запрещен.");
        }
    }
}





























