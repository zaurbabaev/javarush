package az.babayev.javarush.level_1;

public class Lection4 {
    int a;

    static void main() {
        int x = 1;
        int y = x * 2;
        int z = 5 * y * y + 2 * y + 3;
        System.out.println(z);

        int a = 5;
        int b = 1;
        int c = (a - b) * (a + b);
        System.out.println(c);

        int a1 = 64;
        int b1 = a1 / 8;
        int c1 = b1 / 4;
        int d1 = c1 * 3;
        System.out.println(d1);

        String s1 = "Amigo" + "the best";
        String s2 = "";

        int x1 = 2025;
        String s3 = "Amigo" + x1;
        System.out.println(s3);

        Lection4 lection4 = new Lection4();
        lection4.a++;
        System.out.println(lection4.a);

        /*int aa;
        aa++; // java: variable aa might not have been initialized
        System.out.println(aa);*/

        int number = 10;
        String code = "10";
        String message = number + code;
        System.out.println(message);

        calculateFibonacci(10);

    }

    public static void calculateFibonacci(int number) {
        if (number < 0) {
            return;
        }
        int prev = 0;
        int current = 1;
        System.out.print(prev);
        if (number == 0) {
            return;
        }
        System.out.print(" " + current);
        for (int i = 2; i <= number; i++) {
            int temp = prev + current;
            prev = current;
            current = temp;
            System.out.print(" " + current);
        }
    }
}
