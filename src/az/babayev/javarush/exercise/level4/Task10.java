package az.babayev.javarush.exercise.level4;

import java.util.Scanner;

/*
Вы разрабатываете интерфейс для банкомата. Банкомат должен запрашивать PIN-код, пока пользователь не введёт четырёхзначное положительное число.
Используйте цикл do-while и Scanner, чтобы программа запрашивала ввод, пока пользователь не введёт число, строго большее 0.
После ввода корректного числа выведите на экран текст: "PIN-код принят".
*/
public class Task10 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int code;
        do {
            code = scanner.nextInt();
            System.out.println(code);
        } while (!(code >= 1000 && code <= 9999));

        System.out.println("PIN-код принят");
    }
}
