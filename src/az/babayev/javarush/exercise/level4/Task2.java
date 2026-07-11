package az.babayev.javarush.exercise.level4;

import java.util.Scanner;

/*
Вы пишете программу для разблокировки смартфона. Пользователь должен ввести правильный пароль.
Запрашивайте у пользователя ввод пароля, пока он не введет слово "java".
Как только пароль введен верно, выведите на экран "Смартфон разблокирован!".
*/
public class Task2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!"java".equals(input)) {
            System.out.println("Введите пароль:");
            input = scanner.nextLine();
        }
        System.out.println("Смартфон разблокирован!");
    }
}
