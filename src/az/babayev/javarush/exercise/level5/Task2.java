package az.babayev.javarush.exercise.level5;

import java.util.Scanner;

/*
Вы — хранитель древнего шифра, который позволяет разблокировать вход в тайную библиотеку.
Но ключ к библиотеке — не просто число, это должно быть «истинное» число, нерушимое и неделимое, кроме как на себя и единицу.

Ваша миссия: получить от пользователя загадочное целое число (назовите его, например, secretKeyCandidate).
Затем вы должны определить, является ли это число истинным ключом, то есть простым числом,
которое делится без остатка только на 1 и на себя. Если число окажется простым, вы должны подтвердить его подлинность,
 выведя на экран "YES". В противном случае, если оно делится на что-то ещё, это просто отвлекающий маневр, и вам следует вывести "NO".
Например, если пользователь введет 7, ваша программа должна будет сказать: YES.
*/
public class Task2 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int secretKeyCandidate = scanner.nextInt();

        if (secretKeyCandidate <= 1) {
            System.out.println("NO");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= secretKeyCandidate / i; i++) {
            if (secretKeyCandidate % i == 0) {
                isPrime = false;
                break;
            }

        }
        System.out.println(isPrime ? "YES" : "NO");
    }
}
