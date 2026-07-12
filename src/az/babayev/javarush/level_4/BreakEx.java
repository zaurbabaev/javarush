package az.babayev.javarush.level_4;

public class BreakEx {
    static void main() {

        int number = 113;
        boolean found = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                found = true;
                System.out.println("Нашли делитель " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Делитель не найден - число простое.");
        }
    }
}
