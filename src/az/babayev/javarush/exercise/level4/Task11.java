package az.babayev.javarush.exercise.level4;

import java.util.Scanner;

/*Реализуйте простое текстовое меню для командной строки с помощью do-while. Программа должна выводить на экран:

Меню:
1. Вывести приветствие
2. Выйти

Пользователь вводит номер пункта меню. Если выбран пункт 1, программа выводит "Привет!"
и снова показывает меню.
Если выбран пункт 2, программа завершает работу. Для ввода используйте Scanner.*/
public class Task11 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("Меню:");
            System.out.println("1. Вывести приветствие");
            System.out.println("2. Выйти");
            input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("Привет!");
            }
        } while (!input.equals("2"));
    }
}
