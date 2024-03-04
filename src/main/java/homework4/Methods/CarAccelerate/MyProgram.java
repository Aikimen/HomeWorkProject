package homework4.Methods.CarAccelerate;

public class MyProgram {
    public static void main(String[] args) {
        Car car = new Car("S60", "Volvo");

        int speed = car.getCurrentSpeed();
        System.out.println(speed); // тут 0

        car.speedUp(25);
        speed = car.getCurrentSpeed();
        System.out.println(speed); // тут 25

        car.brake();
        speed = car.getCurrentSpeed();
        System.out.println(speed); // тут 15

        car.brake();
        speed = car.getCurrentSpeed();
        System.out.println(speed); // тут 5

        car.brake();
        speed = car.getCurrentSpeed();
        System.out.println(speed); // тут 0
    }
}
