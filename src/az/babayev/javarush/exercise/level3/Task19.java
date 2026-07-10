package az.babayev.javarush.exercise.level3;

/*
Ваше приложение должно приветствовать пользователя по-разному в зависимости от времени суток.
Объявите переменную int currentHour, которая хранит текущий час (от 0 до 23).
С помощью тернарного оператора присвойте строковой переменной greetingMessage значение "Доброе утро", если currentHour меньше 12, иначе "Добрый день".
Выведите greetingMessage на экран.
*/
public class Task19 {
    static void main() {
        int currentHour = 10;
        String greetingMessage = currentHour < 12 ? "Доброе утро" : "Добрый день";
        System.out.println(greetingMessage);
    }
}
