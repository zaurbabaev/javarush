package az.babayev.javarush.exercise.level3;

/*
Вы с друзьями планируете пикник на выходных. Задайте две переменные типа boolean: isSunny и isWeekend.
Создайте переменную canGoToPark, которая будет true только если и isSunny, и isWeekend равны true (используйте оператор && ).
Создайте вторую переменную canStayHome, которая будет true, если хотя бы один из дней не соответствует условиям для пикника (используйте оператор || и 1).
Выведите значения обеих новых переменных на экран.*/
public class Task11 {
    static void main() {
        boolean isSunny = true;
        boolean isWeekend = false;
        boolean canGoToPark = isSunny && isWeekend;
        boolean canStayHome = !isSunny || !isWeekend;
        System.out.println(canGoToPark);
        System.out.println(canStayHome);
    }
}
