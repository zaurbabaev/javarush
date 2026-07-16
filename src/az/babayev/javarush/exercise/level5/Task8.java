package az.babayev.javarush.exercise.level5;

import java.util.Scanner;

/*
Вы организатор соревнований по поиску золотого кубка. Участникам предстоит пройти три разных пути,
и чтобы определить победителя в напряжённой гонке, вам нужно найти самый короткий путь.
Каждый путь имеет свою уникальную продолжительность в минутах.
Ваша программа должна принять три числовых значения (например, pathOne, pathTwo, pathThree),
представляющих продолжительность каждого пути. Затем она должна мгновенно определить,
какой из этих путей является наименьшим по времени, и вывести это минимальное значение на экран.
Это позволит объявить чемпиона по самому быстрому прохождению!
*/
public class Task8 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int pathOne = scanner.nextInt();
        int pathTwo = scanner.nextInt();
        int pathThree = scanner.nextInt();

        if (pathOne < pathTwo && pathOne < pathThree) {
            System.out.println(pathOne);
        } else if (pathTwo < pathOne && pathTwo < pathThree) {
            System.out.println(pathTwo);
        } else {
            System.out.println(pathThree);
        }
    }
}
