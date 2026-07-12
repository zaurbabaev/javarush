package az.babayev.javarush.exercise.level4;

import java.util.Scanner;

/*
Пользователь вводит с клавиатуры целое число n (больше 1).
Ваша задача — проверить, является ли это число простым (делится только на 1 и на само себя).
Используйте цикл for, чтобы найти первый делитель этого числа (от 2 до n-1).
Как только делитель найден, выведите его на экран и завершите цикл.
Если делитель не найден, выведите "Число простое".
*/
public class Task15 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число больше 1:");
        int num = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Число простое");
        }
    }
}
