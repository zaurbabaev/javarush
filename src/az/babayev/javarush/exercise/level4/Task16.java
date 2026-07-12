package az.babayev.javarush.exercise.level4;

import java.util.Scanner;

/*
Вы фиксируете продажи за день. Вводите суммы каждой продажи с клавиатуры до тех пор, пока не введёте отрицательное число (что означает конец рабочего дня).
Как только вы вводите отрицательное число, программа должна показать итоговую сумму всех продаж и завершиться. Отрицательное число в общую сумму не включается.
*/
public class Task16 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Вводите число: ");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
