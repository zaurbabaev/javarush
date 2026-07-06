package az.babayev.javarush.exercise.level3;

/*
Ваше приложение должно менять приветствие в зависимости от времени.
Объявите переменную int currentHour и присвойте ей значение 20.
Используйте оператор if-else if-else, чтобы вывести:
"Доброе утро!", если currentHour меньше 12.
"Добрый день!", если currentHour от 12 до 18 (включительно).
"Добрый вечер!" во всех остальных случаях.
*/
public class Test4 {
    static void main() {
        int currentHour = 20;
        if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour >= 12 && currentHour <= 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }
    }
}
