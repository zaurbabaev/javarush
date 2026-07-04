package az.babayev.javarush.exercise.level2;

/*Представьте, что вы создаете профиль для игрового персонажа. Объявите четыре переменные разных типов, чтобы хранить информацию о нём:
byte для его уровня (level)
int для количества золота (goldAmount)
double для его рейтинга (rating)
String для имени (characterName)
Присвойте им любые значения и выведите все данные на экран.*/
public class Task13 {
    static void main() {
        byte level = 4;
        int goldAmount = 3456;
        double rating = 4.3;
        String characterName = "Test";
        System.out.println(level);
        System.out.println(goldAmount);
        System.out.println(rating);
        System.out.println(characterName);
    }
}
