package az.babayev.javarush.level_3.lection5;

import java.util.Scanner;

public class TernaryOperatorEx {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите ваш возраст: ");
        int age = Integer.parseInt(scanner.nextLine());

        int nextYear = age + 1;
        String status = (nextYear >= 18) ? "совершеннолетний" : "несовершеннолетний";

        System.out.printf("Привет, %s! В следующем году вам будет %d. Вы будете %s. %n", name, nextYear, status);
    }
}
