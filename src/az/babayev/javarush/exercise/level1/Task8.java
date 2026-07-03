package az.babayev.javarush.exercise.level1;

/*
Вы создаете профиль пользователя в социальной сети. Объявите переменную типа String с именем userName и присвойте ей значение "Alice".
Также, объявите переменную типа int с именем userAge со значением 20.
Затем, создайте переменную profileInfo типа String, в которую вы объедините имя и возраст в строку "Имя: Alice, Возраст: 20". Выведите значение profileInfo на экран.
*/
public class Task8 {
    static void main() {
        String userName = "Alice";
        int userAge = 20;
        String profileInfo = "Имя: " + userName + ", Возраст: " + userAge;
        System.out.println(profileInfo);
    }
}
