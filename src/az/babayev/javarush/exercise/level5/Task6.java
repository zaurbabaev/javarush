package az.babayev.javarush.exercise.level5;

import java.util.Scanner;

/*
В старинном замке нашли свиток с загадочным словом, и легенда гласит,
что оно обладает особой силой, если читается одинаково как слева направо, так и справа налево.
Вы — криптограф, которому поручено проверить, является ли это слово истинным "палиндромом".
Пользователь введёт вам эту загадочную строку (например, ancientRiddle).
Ваша программа должна тщательно проанализировать её.
Если послание читается одинаково в обоих направлениях, выведите "YES", подтверждая его магическую природу.
В противном случае, если оно не является палиндромом, выведите "NO".
*/
public class Task6 {
    static void main() {
        System.out.println("Введите слово: ");
        Scanner scanner = new Scanner(System.in);
        String ancientRiddle = scanner.nextLine();

        boolean palindrome = true;

        for (int i = 0; i < ancientRiddle.length()/2; i++) {
            if (ancientRiddle.charAt(i) != ancientRiddle.charAt(ancientRiddle.length() - i - 1)) {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome ? "YES" : "NO");

    }
}
