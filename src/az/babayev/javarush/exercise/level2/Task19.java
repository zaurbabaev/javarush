package az.babayev.javarush.exercise.level2;

import java.util.Scanner;

/*
Вы работаете на кассе. Напишите программу, которая считывает с клавиатуры цену двух товаров и выводит на экран их общую стоимость.
* */
public class Task19 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(first + second);
    }
}
