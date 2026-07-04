package az.babayev.javarush.exercise.level2;

/*
Представьте, что вы хотите поделиться кодом доступа к секретному файлу. Код доступа — это число.
Создайте переменную типа int с любым значением. Преобразуйте это число в строку, чтобы его можно было отправить в сообщении,
и выведите полученную строку на экран.
*/
public class Task9 {
    static void main() {
        int number = 12345;
        String str = "" + number;
        System.out.println(str);

    }
}
