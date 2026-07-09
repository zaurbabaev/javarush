package az.babayev.javarush.exercise.level3;

/*
Банк рассматривает вашу заявку на кредит по двум разным правилам.
yourAge = 25
hasJob = true
hasCreditHistory = false
hasGuarantor = true
Первое правило: Кредит одобрят, если «ваш возраст больше 21 и у вас есть работа» ИЛИ «у вас есть кредитная история и поручитель»
Второе правило: Кредит одобрят, если «ваш возраст больше 21» И «либо у вас есть работа, либо кредитная история» И «есть поручитель»
Создайте два выражения с учетом этих правил, выведите их результаты.
*/
public class Task16 {
    static void main() {

        int yourAge = 25;
        boolean hasJob = true;
        boolean hasCreditHistory = false;
        boolean hasGuarantor = true;

        boolean result1 = (yourAge > 21 && hasJob) || (hasCreditHistory && hasGuarantor);
        boolean result2 = (yourAge > 21) && (hasJob || hasCreditHistory) && hasGuarantor;
        System.out.println(result1);
        System.out.println(result2);
    }
}
