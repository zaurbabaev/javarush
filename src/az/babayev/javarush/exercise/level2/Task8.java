package az.babayev.javarush.exercise.level2;

/*
Вы получаете данные из формы, которые могут содержать лишние пробелы и неверный регистр.
Создайте переменную типа String с именем cityName
и присвойте ей значение "Istanbul" с несколькими пробелами в начале и конце (минимум один пробел в начале и минимум один пробел в конце).
Выведите на экран длину строки до и после удаления пробелов с помощью метода trim().
Затем выведите название города в верхнем и нижнем регистре.
*/
public class Task8 {
    static void main() {
        String cityName = "      Istanbul       ";
        System.out.println(cityName.length());
        cityName = cityName.trim();
        System.out.println(cityName.length());
        System.out.println(cityName.toUpperCase());
        System.out.println(cityName.toLowerCase());

    }
}
