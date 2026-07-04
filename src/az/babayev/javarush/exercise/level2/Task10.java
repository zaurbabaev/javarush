package az.babayev.javarush.exercise.level2;

/*
Вы пишете программу для отслеживания рейсов. Создайте переменную типа int с любым номером рейса
и переменную типа String с городом назначения. Объедините их с помощью оператора +, чтобы получить полную строку, например, "Рейс 123 до Минска", и выведите её на экран.
* */
public class Task10 {
    static void main() {
        int flight = 123456;
        String city = "Baku";
        String result = "Рейс " + flight + " до " + city;
        System.out.println(result);
    }
}
