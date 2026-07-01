package az.babayev.javarush.exercise;

/*
Представьте, что вы отслеживаете уровень жизни персонажа в игре.
Объявите переменную int heroHealth и присвойте ей значение 10.
Увеличьте уровень жизни на 1 с помощью оператора инкремента и выведите новое значение на экран.
Затем уменьшите уровень жизни на 1 с помощью оператора декремента. После этих операций снова выведите значение переменной heroHealth на экран.
*/
public class Task4 {
    static void main() {
        int heroHealth=10;
        heroHealth++;
        System.out.println(heroHealth);
        heroHealth--;
        System.out.println(heroHealth);
    }
}
