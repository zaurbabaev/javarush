package az.babayev.javarush.exercise.level3;

/*
Чтобы попасть на закрытую вечеринку, нужно выполнить три условия:
• hasInvitation (присвойте ей значение true)
• dressCodeMet (присвойте ей значение false)
• passwordIsCorrect (присвойте ей значение true)

Вы пройдете, только если все три условия верны. Создайте выражение boolean  admitted = hasInvitation && dressCodeMet && passwordIsCorrect ;
Затем создайте еще два выражения, расставив скобки по-разному:
( hasInvitation && dressCodeMet) && passwordIsCorrect и hasInvitation && ( dressCodeMet && passwordIsCorrect ).
Выведите результаты всех трех выражений.*/
public class Task15 {
    static void main() {
        boolean hasInvitation = true;
        boolean dressCodeMet = false;
        boolean passwordIsCorrect = true;

        boolean admitted = hasInvitation && dressCodeMet && passwordIsCorrect;

        boolean admitted2 = (hasInvitation && dressCodeMet) && passwordIsCorrect;

        boolean admitted3 = hasInvitation && (dressCodeMet && passwordIsCorrect);

        System.out.println(admitted);
        System.out.println(admitted2);
        System.out.println(admitted3);
    }
}
