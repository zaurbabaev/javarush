package az.babayev.javarush.level_4;

import java.util.Scanner;

public class DoWhileEx {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String password = "";

        do {
            System.out.println("Введите новый пароль (не менее 6 символов): ");
            password = scanner.nextLine();
        } while (password.length() < 6);
        System.out.println("Пароль принят!");
    }
}
