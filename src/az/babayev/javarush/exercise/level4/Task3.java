package az.babayev.javarush.exercise.level4;

/*
Вы управляете кинотеатром и хотите вывести список доступных мест в ряду.
Используйте цикл while, чтобы вывести на экран все номера кресел, начиная со 2, с шагом в 2, до 10 включительно.
Выведите каждое число на новой строке.
*/
public class Task3 {
    static void main() {
        int a = 2;
        while (a <= 10) {
            System.out.println(a);
            a += 2;
        }
    }
}
