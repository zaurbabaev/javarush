package az.babayev.javarush.level_3.lection5;

import java.util.Scanner;

public class TernaryOperatorEx2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = Integer.parseInt(scanner.nextLine());

        String category = (age < 7) ? "дошкольник" :
                (age < 18) ? "школьник" :
                (age < 65) ? "взрослый" : "пенсионер";

        System.out.printf("Привет, Вы %s. %n", category);
    }
}
