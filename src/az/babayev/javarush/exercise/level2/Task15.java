package az.babayev.javarush.exercise.level2;

/*
Вы анализируете, сколько памяти занимают разные типы данных.
Создайте переменные byte (b), int (i) и double (d) и присвойте им любые значения.
Выведите на экран информацию о том, сколько байт занимает каждый тип: byte — 1 байт, int — 4 байта, double — 8 байтов.
*/
public class Task15 {
    static void main() {
        byte b = 12;
        int i = 2345;
        double d = 3.14;
        System.out.println("byte — 1 байт");
        System.out.println("int — 4 байта");
        System.out.println("double — 8 байтов");
    }
}
