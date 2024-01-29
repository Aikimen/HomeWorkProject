package array;

public class GarageTask {
    public static void main(String[] args) {

        Car polo = new Car("red", "vw", "polo", 120);
        Car camry = new Car("black", "toyota", "camry", 1200);

        Car[] garage = {polo, camry};

//        Car[] garage = {
//          new Car("red", "vw", "polo", 120),
//        new Car("white", "toyota", "camry", 1200),
//        };

        System.out.println(garage[0].brand.toUpperCase());

        //вывести цвет, марку и модель каждой машины
//        Car currentCar = garage[0];
//        System.out.println(currentCar.colour + " " + currentCar.brand + "-" + currentCar.model);
//
//        currentCar = garage[1];
//        System.out.println(currentCar.colour + " " + currentCar.brand + "-" + currentCar.model);

        //для каждой машины из списка нужно сделать какое то действие
        //-1
        //-2

        for(Car c: garage) { // for-each
            System.out.println("Начали обработку");
            System.out.println(c.colour + " " + c.brand + "-" + c.model);
            System.out.println("Закончили обработку");
        }
        System.out.println("Finish");

        int garageCapacity = garage.length;
        for(int i = 0; i < garage.length; i++){
            Car currentCar = garage[i];
            System.out.println(currentCar.colour + " " + currentCar.brand + "-" + currentCar.model);
        }
            int x= 10;
//            x = x + 10;
        //X++
        //Возьми текущее значение и отдай его
        //Увеличь значение на 1
            int y = (++x);
            int z = x++;
        System.out.println(y + " " + z);


    }
}
