package az.babayev.javarush.level_3.lection3;

public class Task1 {
    static void main() {
        int age = 16;
        boolean hasTicked = true;
        boolean canAttend = age >= 14 && hasTicked; // true

        boolean isAdmin = false;
        boolean isModerator = true;
        boolean canEdit = isAdmin || isModerator; // true


        boolean isWeekend = false;
        boolean shouldToWork = !isWeekend; // true


        int yearsOld = 17;
        boolean hasTicket = false;
        boolean isVip = true;

        boolean canGo = (age >= 18 && hasTicket) || isVip; // true


    }
}
