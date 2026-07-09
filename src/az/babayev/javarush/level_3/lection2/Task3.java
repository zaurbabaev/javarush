package az.babayev.javarush.level_3.lection2;

import java.util.Scanner;

public class Task3 {
    static void main() {

        Scanner console = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = Integer.parseInt(console.nextLine());

        double discount = 0;

        if (age >= 60) {
            discount = 0.15;
        } else {
            System.out.print("Есть ли у вас клубная карта (да/нет)? ");
            String hasCard = console.nextLine();

            if (hasCard.equalsIgnoreCase("да")) {
                discount = 0.17;
            }
        }
        System.out.printf("Ваша скидка: %.2f%% \n", discount * 100);
    }
}
