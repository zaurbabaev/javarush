package az.babayev.javarush.exercise.level2;

import java.util.Scanner;

/*
Представьте, что вы создаете форму для регистрации нового игрока.
Напишите программу, которая сначала запрашивает имя игрока (строку), а затем его возраст (целое число).
После этого программа должна вывести на экран возраст и имя игрока, каждое с новой строки.
*/
public class Task18 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        System.out.println(year);
        System.out.println(name);
        scanner.close();
    }
}
