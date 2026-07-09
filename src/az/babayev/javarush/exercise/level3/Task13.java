package az.babayev.javarush.exercise.level3;

/*
Представьте, что вы планируете отпуск и выбираете, куда поехать: в горы или на море.
Объявите три переменные типа boolean
• toTheSea (присвойте ей значение true
• hasPlaneTickets (присвойте ей значение false)
• hasHotelRooms (присвойте ей значение true
Для успешного отпуска вам нужно, чтобы было либо «море», либо «билеты на самолет и места в отеле».
Создайте выражение boolean vacationHappened = toTheSea || hasPlaneTickets && hasHotelRooms; и выведите его результат на экран.
*/
public class Task13 {

    static void main() {
        boolean toTheSea = true;
        boolean hasPlaneTickets = false;
        boolean hasHotelRooms = true;
        boolean vacationHappened = toTheSea || hasPlaneTickets && hasHotelRooms;
        System.out.println(vacationHappened);
    }
}
