package az.babayev.javarush.exercise.level4;

/*
Вы пишете программу для праздничного обратного отсчёта.
Создайте цикл for, который выводит числа от 5 до 1 в обратном порядке (каждое число — на новой строке),
а после завершения цикла выводит строку "С Новым годом!".
  */
public class Task5 {
    static void main() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("С Новым годом!");
    }
}
