package reviewwork1.task2;

import java.util.Calendar;
import java.util.Date;

public class Cactus {

    private Calendar lastDateOfWater;

    public Cactus(Calendar lastDateOfWater) {
        this.lastDateOfWater = lastDateOfWater;
    }

    public Calendar getLastDateOfWater() {
        return lastDateOfWater;
    }

    public void setLastDateOfWater(Calendar lastDateOfWater) {
        this.lastDateOfWater = lastDateOfWater;
    }

    // Метод для проверки, нужно ли поливать кактус
    public boolean needsWatering(Seasons currentSeason, int humidity) {
        Calendar currentDate = Calendar.getInstance();

        // Получаем текущий месяц (январь - 1, февраль - 2, - , декабрь - 12)
        int currentMonth = currentDate.get(Calendar.MONTH);

        // Проверка на сезон и влажность
        if (humidity < 30) {
            // Если влажность меньше 30, кактус нужно полить независимо от сезона
            return true;
        } else if (currentSeason == Seasons.WINTER) {
            // В зимний период поливаем раз в месяц
            return currentMonth != lastDateOfWater.get(Calendar.MONTH);
        } else if (currentSeason == Seasons.SPRING || currentSeason == Seasons.AUTUMN) {
            // Весной и осенью поливаем раз в неделю
            return isMoreThanOneWeekSinceLastWatering(currentDate);
        } else if (currentSeason == Seasons.SUMMER) {
            // Летом поливаем в зависимости от влажности воздуха, но не чаще раза в два дня
            return !isLessThanTwoDaysSinceLastWatering(currentDate);
        } else {
            return false;
        }
    }

    // Метод для проверки, прошло ли более недели с последнего полива
    private boolean isMoreThanOneWeekSinceLastWatering(Calendar currentDate) {
        int diff = (int) (currentDate.getTimeInMillis() - lastDateOfWater.getTimeInMillis());
        int diffInDays = diff / (1000 * 60 * 60 * 24);
        return diffInDays >= 7;
    }

    // Метод для проверки, прошло ли менее двух дней с последнего полива
    private boolean isLessThanTwoDaysSinceLastWatering(Calendar currentDate) {
        int diff = (int) (currentDate.getTimeInMillis() - lastDateOfWater.getTimeInMillis());
        int diffInDays = diff / (1000 * 60 * 60 * 24);
        return diff < 2;
    }

}
