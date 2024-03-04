package homework4.Conditions.Task3;

public class Task3 {
    public static void main(String[] args) {

        int number = 586;

        if(number % 2 == 0){
            System.out.println("Чётное число.");
            if(number % 4 == 0) {
                System.out.println("Чётное число. Кратно четырем.");
            }
        } else  {
            System.out.println("Нечётное число");
            if (number % 3 == 0) {
                System.out.println("Нечётное число. Кратно трём.");
            }
        }

    }
}
