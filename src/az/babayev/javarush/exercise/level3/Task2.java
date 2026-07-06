package az.babayev.javarush.exercise.level3;

/*
Вы пишете программу, которая помогает выбрать одежду.
Создайте переменную int currentTemperature и присвойте ей значение -5.
С помощью оператора if-else выведите на экран "Оденьтесь потеплее, на улице мороз!",
если температура меньше 0. Иначе выведите "Можно идти в легкой одежде!".
*/
public class Task2 {
    static void main() {
        int currentTemperature = -5;
        if (currentTemperature < 0) {
            System.out.println("Оденьтесь потеплее, на улице мороз!");
        } else {
            System.out.println("Можно идти в легкой одежде!");
        }
    }
}
