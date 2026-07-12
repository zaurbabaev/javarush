package az.babayev.javarush.level_4;

import java.util.Scanner;

public class DoWhileEx2 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        String command = "";
        do {
            System.out.println("Меню:");
            System.out.println("1. Показать приветствие");
            System.out.println("2. Выйти");
            System.out.print("Выберите действие: ");
            command = scanner.nextLine();

            if (command.equals("1")) {
                System.out.println("Привет, мир!");
            } else if (!command.equals("2")) {
                System.out.println("Неизвестная команда.");
            }
        } while (!command.equals("2"));

        System.out.println("Пока!");

    }
}
