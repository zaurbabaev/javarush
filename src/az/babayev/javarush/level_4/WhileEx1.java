package az.babayev.javarush.level_4;

import java.util.Scanner;

public class WhileEx1 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        String password = "";

        while(!password.equals("qwerty")) {
            System.out.print("Введите пароль: ");
            password=scanner.nextLine();
        }
        System.out.println("Добро пожаловать!");
    }
}
