package az.babayev.javarush.exercise.level1;

/*
Представьте, что вы хотите узнать, сколько лет вашему проекту, который начался в 2019 году.
Объявите две переменные типа int: currentYear (присвойте ей значение 2025) и projectAge.
Присвойте переменной projectAge значение, равное разнице между currentYear и 2019.
Затем выведите на экран возраст проекта.
*/
public class Task6 {

    static void main() {
        int currentYear=2025;
        int projectAge=currentYear - 2019;
        System.out.println(projectAge);
    }

}
