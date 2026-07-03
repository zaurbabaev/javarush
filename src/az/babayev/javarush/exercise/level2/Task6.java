package az.babayev.javarush.exercise.level2;

/*
Вы создаете профиль для пользователя. Создайте две переменные типа
String: firstName со значением "Luke" и
lastName со значением "Skywalker".
Объедините их в одну строку, добавив пробел между именем и фамилией, и выведите результат на экран.
* */
public class Task6 {
    static void main() {
        String firstName = "Luke";
        String lastName = "Skywalker";
        String result = firstName + " " + lastName;
        System.out.println(result);
    }
}
