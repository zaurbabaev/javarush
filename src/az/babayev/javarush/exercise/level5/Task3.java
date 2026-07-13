package az.babayev.javarush.exercise.level5;

import java.util.Scanner;

/*
В старинном свитке вы обнаружили загадочное послание от забытого волшебника.
Его слова имеют необычную природу: чтобы раскрыть их истинный смысл, их нужно прочитать в обратном порядке.
Это как смотреть в волшебное зеркало, которое переворачивает все буквы.
Ваша задача — написать программу, которая поможет вам увидеть его "обратную сторону".
Попросите пользователя ввести любую строку текста (назовите её magicMessage).
Затем ваша программа должна мгновенно отразить это послание, выведя все символы в строго обратном порядке.
Так, если введено слово "cat", должно появиться "tac".
*/
public class Task3 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String magicMessage = scanner.nextLine();

        String newMessage = "";
        for (int i = 0; i < magicMessage.length(); i++) {
            newMessage += magicMessage.charAt(magicMessage.length() - 1 - i);
        }
        System.out.println(newMessage);
    }
}
