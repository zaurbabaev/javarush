package az.babayev.javarush.exercise.level3;

/*
Вы продаёте билеты на аттракцион и хотите определить категорию билета в зависимости от возраста.
Объявите переменную int visitorAge и присвойте ей любое значение.
Используйте вложенные тернарные операторы, чтобы определить строковую переменную ticketCategory по следующим правилам:
"Детский", если visitorAge меньше 7
"Подростковый", если visitorAge от 7 (включительно) до 17 (включительно)
"Взрослый", если visitorAge от 18 до 64 (включительно)
"Пенсионный", если visitorAge 65 и больше
Выведите значение переменной ticketCategory на экран.
*/
public class Test20 {
    static void main() {
        int visitorAge = 65;
        String ticketCategory = (visitorAge < 7) ? "Детский" :
                (visitorAge <= 17) ? "Подростковый" :
                (visitorAge <= 64) ? "Взрослый" : "Пенсионный";
        System.out.println(ticketCategory);
    }
}
