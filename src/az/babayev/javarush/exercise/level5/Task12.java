package az.babayev.javarush.exercise.level5;

import java.util.Scanner;

/*
В подземелье прячется дракон с 50 жизнями. У храброго рыцаря есть лишь 10 ударов, чтобы его победить.
Правила боя:

Каждый ход программа спрашивает у рыцаря, какой урон (число от 1 до 10) нанести.
Из здоровья дракона вычитается это число.
Если жизни дракона стали 0 или меньше — программа выводит: Дракон повержен!
Если удары закончились, а дракон всё ещё жив — программа сообщает: Рыцарь проиграл!
*/
public class Task12 {

    static void main() {
        int dragonHp = 50;
        int knightHits = 10;

        Scanner console = new Scanner(System.in);

        System.out.println("Вы напали на спящего дракона - дракон расстроился");

        while (knightHits > 0 && dragonHp > 0) {

            System.out.println("Сила удара (1-10): ");
            int damage = console.nextInt();

            if (damage < 1 || damage > 10) {
                System.out.println("Промах!");
                continue;
            }
            dragonHp -= damage;
            knightHits--;

            if (dragonHp <= 0) {
                System.out.println("Дракон повержен!");
                break;
            }
        }

        if (dragonHp > 0) {
            System.out.println("Рыцарь проиграл!");
        }
    }
}
