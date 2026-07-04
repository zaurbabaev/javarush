package az.babayev.javarush.exercise.level2;

/*
Представьте, что вы управляете двумя счетами в банке.
Объявите две переменные int: account1 со значением 100 и account2 со значением 200.
Затем переведите деньги со счета 1 на счет 2: присвойте account2 значение account2 плюс account1, а account1 присвойте 0.
После этого на счет 1 приходит бонус в размере 50. Увеличьте account1 на 50.
Выведите значения обеих переменных на экран.
*/
public class Task16 {
    static void main() {
        int account1 = 100;
        int account2 = 200;
        account2 = account2 + account1;
        account1 = 0;
        account1 +=50;
        System.out.println(account1);
        System.out.println(account2);
    }
}
