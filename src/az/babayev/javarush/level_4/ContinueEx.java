package az.babayev.javarush.level_4;

public class ContinueEx {
    static void main() {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Нечетное число: " + i);
        }
    }
}
