package az.babayev.javarush.exercise.level3;

/*
В вашем онлайн-магазине всем заказам присваиваются номера.
Объявите переменную int orderNumber и присвойте ей любое целое число.
Используя тернарный оператор, создайте строковую переменную orderStatus,
которая будет иметь значение "Чётный", если номер заказа делится на 2 без остатка,
и "Нечётный" в противном случае. Выведите значение orderStatus на экран.*/
public class Task18 {
    static void main() {
        int orderNumber = 122;
        String orderStatus = (orderNumber % 2 == 0) ? "Чётный" : "Нечётный";
        System.out.println(orderStatus);
    }

}
