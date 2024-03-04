package oop;

public class CarsPlayground {
    public static void main(String[] args) {

        Car car1 = new Car("red", "opel", "zarina", "A11AA177", 120);
        Car car2 = new Car("black", "bmw", "x1", "A123AA01", 150);
        Car car3 = new Car("white", "fiat", "500", "F1234F13", 90);

        car1.setHp(100);
        System.out.println(car1.getHp());


        car1.setColor("blue");

        String city = "Москва";
        boolean r = city.startsWith("Мо");
        System.out.println(r);


    }

}
