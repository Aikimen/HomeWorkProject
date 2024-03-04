package homework4.Conditions.Task4;

public class Task4 {
    public static void main(String[] args) {

        String url = "https://vk.com/";

        if (url.startsWith("https")) {
            System.out.println("Соединение безопасное");
        } else {
            System.out.println("Небезопаcно. Не указывайте логины, пароли и данные банковских карт");
        }

    }
}
