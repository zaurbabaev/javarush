package az.babayev.javarush.exercise.level1;

/*
Вы рассчитываете стоимость заказа в магазине. Объявите три переменные типа
int: itemPrice со значением 4,
itemCount со значением 3,
discount со значением 2.
Создайте переменную totalCost, в которую запишите значение выражения itemPrice * itemCount - discount.
После этого создайте переменную finalMessage типа String, в которую вы запишете строку
"Итоговая стоимость: " + totalCost, и выведите её на экран.
*/
public class Task9 {
    static void main() {
        int itemPrice = 4;
        int itemCount= 3;
        int discount=2;
        int totalCost= itemPrice * itemCount - discount;
        String finalMessage = "Итоговая стоимость: " + totalCost;
        System.out.println(finalMessage);
    }
}
