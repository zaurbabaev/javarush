package az.babayev.javarush.exercise.level3.task6;

import java.util.Scanner;

public class Solution {
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





























