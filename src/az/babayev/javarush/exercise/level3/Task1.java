package az.babayev.javarush.exercise.level3;

/*
Представьте, что вы пишете программу для кассы кинотеатра.
Создайте переменную int visitorAge и присвойте ей значение 17.
Используйте оператор if-else, чтобы вывести на экран "Доступ запрещен",
если возраст посетителя меньше 18. В противном случае выведите "Добро пожаловать!".*/
public class Task1 {
    static void main() {
        int visitorAge = 17;
        if (visitorAge < 18) {
            System.out.println("Доступ запрещен");
        } else {
            System.out.println("Добро пожаловать!");
        }
    }
}
