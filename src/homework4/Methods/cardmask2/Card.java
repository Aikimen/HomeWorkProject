package homework4.Methods.cardmask2;
import java.util.Date;
public class Card {

    private String number;
    Date validDate;
    private String cvv;
    private String pinCode;

    public Card(String number, Date validDate, String cvv, String pinCode) {
        this.number = number;
        this.validDate = validDate;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }

    public void  printMaskedCardNumber() {
        this.number = number;
        String answer = number.substring(number.length() - 4);
        System.out.println("**** **** **** " + answer);
    }

    public void checkCardPinCode (String inputPinCode) {
        this.pinCode = pinCode;
        if (pinCode.equals(inputPinCode)) {
            System.out.println(number);
        } else {
            System.out.println("Access denied");
        }
    }
}
