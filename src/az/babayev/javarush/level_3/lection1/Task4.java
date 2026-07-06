package az.babayev.javarush.level_3.lection1;

import java.util.Scanner;

public class Task4 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.equals("qwerty")) {
            System.out.println("Вы вошли!");
        }
    }
}
