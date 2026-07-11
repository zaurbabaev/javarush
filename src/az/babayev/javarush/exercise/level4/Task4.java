package az.babayev.javarush.exercise.level4;

import java.util.Scanner;

/*
Представьте, что вы записываете, сколько тратите на кофе каждый день.
Напишите программу, которая запрашивает стоимость каждой чашки.
Ввод должен продолжаться до тех пор, пока вы не введете отрицательное число (например, -1 как сигнал к остановке).
Затем программа должна вывести общую сумму, потраченную на кофе. Отрицательное число в подсчет не включается.
*/
public class Task4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Сколько стоит кофе ?");
            int price = scanner.nextInt();
            if (price < 0) {
                break;
            }
            sum += price;
        }

        System.out.println(sum);
    }
}
