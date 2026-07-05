package az.babayev.javarush.exercise.level2;

import java.util.Scanner;

/*
Вы создаете цифровую визитную карточку.
Напишите программу, которая считывает с клавиатуры ваше имя (строку) и возраст (целое число).
Затем программа должна вывести на экран строку "Меня зовут [имя], мне [возраст] лет.", где имя и возраст заменены на введенные вами значения.
*/
public class Task20 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        System.out.printf("Меня зовут %s, мне %d лет. %n", name, year);
    }
}
