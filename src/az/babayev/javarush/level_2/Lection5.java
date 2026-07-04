package az.babayev.javarush.level_2;

import java.util.Scanner;

public class Lection5 {
    static void main() {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        console.close();

    }
}
