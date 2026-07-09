package az.babayev.javarush.exercise.level3;

/*
Представьте, что вы записываете результат футбольного матча.
Объявите две переменные типа int с любыми значениями, например, ourScore и opponentScore.
Создайте переменную типа boolean с именем weWon, которая будет содержать результат сравнения: наш счёт больше счёта соперника.
Выведите значение переменной weWon на экран.
*/
public class Task10 {
    static void main() {
        int ourScore = 5;
        int opponentScore = 3;
        boolean weWon = ourScore > opponentScore;
        System.out.println(weWon);
    }
}
