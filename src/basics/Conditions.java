package basics;

public class Conditions {
    public static void main(String[] args) {

        int balance = 10; //get from DB
        int amount = 34; // calculate

        System.out.println("Start");
        if (balance >= amount) { // true || false
            System.out.println("Можно купить");
        }

        System.out.println("Finish");

        // Сравнение чисел
        // > >= < <= == !=

        String url = "https://ya.ru";
        if (url.startsWith("https")) {
            System.out.println("Соединение безопасно");
        } else {
            System.out.println("Недостаточно средств");
        }

    }
}
