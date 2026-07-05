package az.babayev.javarush.exercise.level2;

import java.util.Scanner;

/*
Вы разрабатываете систему входа. Напишите программу, которая считывает пароль (одну строку текста) с клавиатуры и выводит его на экран для подтверждения.
* */
public class Task17 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);
        sc.close();
    }
}
