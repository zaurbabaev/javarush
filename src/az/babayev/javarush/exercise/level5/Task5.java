package az.babayev.javarush.exercise.level5;

import java.util.Scanner;

/*
Вы — архитектор света, которому поручено создать сверкающий, идеально симметричный обелиск из звёзд, который будет сиять в ночном небе.
Его высота определяется магическим числом, которое задаст пользователь.
Каждая строка обелиска должна быть шире предыдущей, создавая эффект возрастающего сияния.
Напишите программу, которая по заданному числу N (назовите его pyramidHeight) изобразит его из звёздочек *.
Обелиск должен быть равнобедренным, а символы * равномерно распределены, чтобы создать правильную форму треугольника.
Например, если pyramidHeight равно 3, ваш звёздный обелиск будет выглядеть так:

  *
 ***
*****
*/
public class Task5 {
    static void main() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int pyramidHeight = scanner.nextInt();

        for (int i = 1; i <= pyramidHeight; i++) {
            for (int j = 1; j <= pyramidHeight - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

