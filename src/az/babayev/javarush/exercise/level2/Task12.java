package az.babayev.javarush.exercise.level2;

/*
Вы записываете очки за каждый раунд игры, но они приходят в виде текста.
Создайте две переменные типа String, каждая из которых содержит отрицательное число, например, "-10" и "-25".
Преобразуйте обе строки в числа, сложите их между собой, чтобы получить общий счёт, и выведите результат на экран.
*/
public class Task12 {
    static void main() {
        String num1 = "-10";
        String num2 = "-25";
        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        System.out.println(result);
    }
}
