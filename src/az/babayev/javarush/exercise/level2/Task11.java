package az.babayev.javarush.exercise.level2;

/*
Вы хотите получить год выпуска фильма из названия файла.
Создайте переменную типа String, содержащую только цифры, например, "1999".
Преобразуйте эту строку в число, чтобы можно было выполнять математические операции, и выведите его на экран.
*/
public class Task11 {
    static void main() {
        String year = "1999";
        int number = Integer.parseInt(year);
        System.out.println(number);
    }
}
