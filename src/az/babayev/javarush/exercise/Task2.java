package az.babayev.javarush.exercise;

/*
Вы записываете результаты бросков игральных костей. Создайте три переменные типа int: firstRoll, secondRoll и totalScore.
Присвойте переменной firstRoll значение 7,
secondRoll — 3,
а переменной totalScore — сумму двух первых переменных.
Выведите на экран значение переменной totalScore. Создание и присваивание должно быть выполнено в одной строке.
*/
public class Task2 {
    static void main() {

        int firstRoll = 7, secondRoll = 3, totalScore = firstRoll + secondRoll;

        /*
        int firstRoll = 7;
        int secondRoll = 3;
        int totalScore = firstRoll + secondRoll;
        */

        System.out.println(totalScore);
    }

}
