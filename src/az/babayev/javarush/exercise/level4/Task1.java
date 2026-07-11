package az.babayev.javarush.exercise.level4;


/*
Представьте, что вы пишете программу для запуска космического корабля.
Создайте цикл while, который выводит на экран обратный отсчет от 3 до 1.
Каждое число должно быть на новой строке. После этого выведите сообщение «Старт!».
*/
public class Task1 {
    static void main() {
        int a = 3;
        while (a >= 1) {
            System.out.println(a);
            a--;
        }
        System.out.println("Старт!");
    }
}
