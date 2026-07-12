package az.babayev.javarush.exercise.level4;

/*
Вам нужно вывести номера всех чётных мест в вагоне поезда, с 0-го по 10-е включительно.
Создайте цикл for, который выведет на экран эти номера. Каждое число должно быть на новой строке.
*/
public class Task6 {
    static void main() {
        for (int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        }
    }
}
