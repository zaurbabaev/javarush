package az.babayev.javarush.exercise.level5;

import java.util.Random;
import java.util.Scanner;

/*
Вы — молодой маг, которому поручено найти скрытый кристалл мудрости.
Хитрый дух загадал число от 1 до 100, и оно спрятано в его башне. Чтобы приблизиться к разгадке, вы называете числа, а дух подсказывает:
Если ваше число меньше загаданного, он говорит: Больше!
Если число больше — отвечает: Меньше!
Если угадали точно — дух признаёт поражение и говорит: Верно!, после чего испытание завершается.
Ваша задача — написать программу, которая реализует эту игру, где игрок вводит числа в цикле, пока не угадает.
*/
public class Task11 {
    static void main() {
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();
            if (number < secret) {
                System.out.println("Больше!");
            } else if (number > secret) {
                System.out.println("Меньше!");
            } else {
                System.out.println("Верно!");
                break;
            }
        }
    }
}
