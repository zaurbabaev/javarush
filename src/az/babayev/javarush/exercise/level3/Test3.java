package az.babayev.javarush.exercise.level3;

/*
Вы разрабатываете простую систему входа.
Объявите переменную String userPassword и присвойте ей значение "qwerty".
Используйте оператор if без else, чтобы вывести "Вход выполнен успешно",
если userPassword равен "qwerty". Если пароль неверный, программа ничего не должна делать.
*/
public class Test3 {
    static void main() {
        String userPassword = "qwerty";
        if (userPassword.equals("qwerty")) {
            System.out.println("Вход выполнен успешно");
        }
    }
}
