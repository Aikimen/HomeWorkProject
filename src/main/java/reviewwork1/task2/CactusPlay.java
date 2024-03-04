package reviewwork1.task2;

import java.util.Calendar;
import java.util.Date;


public class CactusPlay {
    public static void main(String[] args) {

        // Укажем дату последнего полива
        Calendar lastDateOfWater = Calendar.getInstance();
        lastDateOfWater.set(2024, Calendar.JANUARY, 25); // установим 25 января 2024 года


        // Создаем экземпляр класса Кактус с указанной датой последнего полива
        Cactus cactus = new Cactus(lastDateOfWater);

        // Получаем текущую влажность от датчикаSensor sensor = new Sensor();
        int humidity = Sensor.generateHumidity();
        System.out.println(humidity);

        // Определяем текущий сезон
        Seasons currentSeason;
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // Получаем текущий месяц (январь - 1, февраль - 2, ..., декабрь - 12)
        if (currentMonth >= 3 && currentMonth <= 5) {
            currentSeason = Seasons.SPRING;
        } else if (currentMonth >= 6 && currentMonth <= 8) {
            currentSeason = Seasons.SUMMER;
        } else if (currentMonth >= 9 && currentMonth <= 11) {
            currentSeason = Seasons.AUTUMN;
        } else {
            currentSeason = Seasons.WINTER;
        }



        // Проверяем, нужно ли поливать кактус
        if (cactus.needsWatering(currentSeason, humidity)) {
            // Выводим сообщение о необходимости полива
            System.out.println("Кактус нужно полить");
        } else {
            // Выводим сообщение о том, что полив не требуется
            System.out.println("Полив кактуса не требуется");
        }

    }
}
