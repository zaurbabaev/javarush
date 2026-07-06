package az.babayev.javarush.level_3.lection2;

import java.util.Scanner;

public class Task1 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // nextInt ədəd oxuduğundan enteri basdıqdan sonra yeni sətir simvolunu (\n) oxumur. Burada nextLine() yazmasaq aşağıdakı code \n-i oxuyacaq və nəticə olaraq boş simvol qayatacaq. Beləcə kodunuz istədiyimiz nəticəni verməyəcək.

       /*
        int age = scanner.nextInt();
        scanner.nextLine();
        bu 2 kodu yazmaq yerinə belə yazmaq daha professional sayılır. int age = Integer.parseInt(scanner.nextLine()); hər yerdə yalnız nextLine istifadə edirik.
        */

        if (age >= 21) {
            System.out.print("Введите пригласительный код: ");
            String code = scanner.nextLine();
            if (code.equals("VIP2024")) {
                System.out.println("Добро пожаловать, " + name + ", в VIP-клуб!");
            } else {
                System.out.println("Извините, неверный код. Доступ запрещён.");
            }
        } else {
            System.out.println("Извините, вход только с 21 года!");
        }

        scanner.close();


    }
}
