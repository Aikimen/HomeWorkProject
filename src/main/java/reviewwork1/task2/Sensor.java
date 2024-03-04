package reviewwork1.task2;

public class Sensor {

    // метод генерирует случайное число от 0 до 100, представляющее влажность воздуха
    public static int generateHumidity() {
        int humidity = (int) (Math.random() * 100);
        return humidity;
    }
}
