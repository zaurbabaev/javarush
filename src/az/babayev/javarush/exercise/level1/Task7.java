package az.babayev.javarush.exercise.level1;

/*
Представьте, что вы ведете счет в игре. Объявите две переменные типа int: player1Score со значением 1999 и player2Score со значением 25.
Создайте переменную totalScore, в которую запишите общую сумму очков обоих игроков, и выведите её на экран.
*/
public class Task7 {
    static void main() {
        int player1Score = 1999;
        int player2Score = 25;

        int totalScore = player1Score + player2Score;
        System.out.println(totalScore);
    }

}
