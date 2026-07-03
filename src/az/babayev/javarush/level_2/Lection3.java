package az.babayev.javarush.level_2;

public class Lection3 {
    static void main() {
        int num = 42;
        String str = String.valueOf(num);
        System.out.println(str); // 42
        String str1 = "" + num;
        System.out.println(str1); // 42

        int a = 5;
        String s1 = "Anna" + a;
        System.out.println(s1); // Anna5

        String city = a + "New York" + a;
        System.out.println(city);

        String st = "123";
        int x = Integer.parseInt(st);
        System.out.println(x);

        String str2 = "456";
        int num1 = Integer.parseInt(str2);
        System.out.println(num1);

        int num2 = Integer.parseInt("321" + 0);
        System.out.println(num2); // 3210

        

    }
}
