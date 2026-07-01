package az.babayev.javarush.exercise;

/*
У вас есть 15 призов, которые нужно поделить между 4 командами. Создайте две переменные типа int: prizes со значением 15 и teams со значением 4.
Вычислите и выведите на экран, сколько целых призов получит каждая команда. На новой строке выведите, сколько призов останется после раздачи.
*/
public class Task3 {
    static void main() {

        int prizes = 15;
        int teams = 4;
        System.out.println(prizes / teams);
        System.out.println(prizes % teams);

    }
}
