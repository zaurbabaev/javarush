package az.babayev.javarush.exercise.level3;

/*
Представьте, что два спортсмена, Алекс и Майк, соревнуются в скорости.
Объявите две переменные типа int: alexsTime и mikesTime. Присвойте им любое время в секундах.
Используя тернарный оператор, определите, кто из них быстрее. Сохраните наименьшее время в переменную fastestTime и выведите её на экран.
*/
public class Task17 {
    static void main() {
        int alexsTime = 800;
        int mikesTime = 700;
        int fastestTime = alexsTime > mikesTime ? mikesTime : alexsTime;
        System.out.println(fastestTime);
    }
}
