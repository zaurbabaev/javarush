package az.babayev.javarush.exercise.level3;

/*
Вы хотите купить билет на концерт любимой группы. Условия покупки такие:

ticketsOnSale (присвойте ей значение false
haveMoneyForTicket (присвойте ей значение true)
concertNotCanceled (присвойте ей значение false)

Чтобы купить билет, нужно, чтобы: «либо билеты были в продаже, либо у вас были деньги и концерт не отменили».
Создайте выражение
boolean canBuy = ticketsOnSale || haveMoneyForTicket && concertNotCanceled;
Затем создайте новое выражение, добавив скобки так:
boolean canBuyWithNewMeaning = (ticketsOnSale || haveMoneyForTicket) && concertNotCanceled;
Выведите оба результата.*/
public class Task14 {
    static void main() {
        boolean ticketsOnSale = false;
        boolean haveMoneyForTicket = true;
        boolean concertNotCanceled = false;

        boolean canBuy = ticketsOnSale || haveMoneyForTicket && concertNotCanceled;

        boolean canBuyWithNewMeaning = (ticketsOnSale || haveMoneyForTicket) && concertNotCanceled;
        System.out.println(canBuy);
        System.out.println(canBuyWithNewMeaning);
    }
}
