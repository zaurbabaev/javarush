package az.babayev.javarush.exercise.level3;


/*
Вы создаёте умный термостат. Объявите переменную int с именем  roomTemperature.
Создайте переменную типа boolean с именем isComfortable, которая станет true,
если roomTemperature находится в комфортном диапазоне от 20 до 25 градусов включительно.
Выведите значение isComfortable на экран.*/
public class Task12 {
    static void main() {
        int roomTemperature = 19;
        boolean isComfortable=false;
        if (roomTemperature >= 20 && roomTemperature <= 25) {
            isComfortable = true;
        }
        System.out.println(isComfortable);
    }
}
