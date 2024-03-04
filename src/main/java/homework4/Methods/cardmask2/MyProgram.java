package homework4.Methods.cardmask2;

import java.util.Date;

public class MyProgram {
    public static void main(String[] args) {

        Card visaCard = new Card("4806050072818677", new Date(2029/02), "131", "7788");

        // Вызываем метод печати номера карты с маской.
        visaCard.printMaskedCardNumber();

        //Вызываем метод проверки пин (пин невалиден)
        visaCard.checkCardPinCode("1820");

        //Вызываем метод проверки пин (пин валиден)
        visaCard.checkCardPinCode("7788");




    }
}
