package homework2.task1;

public class CardNumberMask {
    public static void main(String[] args) {
            /*1*. Маскировать номер карты.
    Дана переменная String cardNumber = "1234 5678 9012 3456";
    Напишите код, который выведет карту в формате "**** **** **** 3456"
    Убедитесь, что код работает, если номер карты будет передан без пробелов "1234567890123456"*/

//        String cardNumber = "1234 5678 9012 3456";
       String cardNumber = "1234567890123456";
       //В переменную Answer выводим последние 4-е цифры подстроки.
        String answer = cardNumber.substring(cardNumber.length() - 4);
        System.out.println("**** **** **** " + answer);

    }

 /*   public String returnCardNumberLast4Digits (String cardNumber) {
        String answer = cardNumber.substring(cardNumber.length() - 4,cardNumber.length());
        return answer;
    }
*/

}
