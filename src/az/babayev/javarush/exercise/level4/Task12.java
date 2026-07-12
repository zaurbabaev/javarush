package az.babayev.javarush.exercise.level4;

import java.util.Scanner;

/*
Вы создаёте форму регистрации, где пароль должен быть не короче 6 символов.
Запросите у пользователя ввод пароля с помощью Scanner.
Используйте цикл do-while, чтобы программа повторно запрашивала пароль, пока введённая строка короче 6 символов.
После ввода корректного пароля программа должна вывести "Пароль надёжен, аккаунт создан!".
*/
public class Task12 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Вводи пароль: ");
            input = scanner.nextLine();
        } while (!(input.length() >= 6));
        System.out.println("Пароль надёжен, аккаунт создан!");
    }
}
