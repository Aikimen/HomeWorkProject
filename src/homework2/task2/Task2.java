package homework2.task2;

public class Task2 {
    public static void main(String[] args) {

        Flat flat = new Flat();
        flat.flatNumber = 28;
        flat.flatSquare = 57;
        flat.roomQuantity = 3;

        Room bedroom = new Room();
        bedroom.roomTitle = "bedroom";
        bedroom.isHaveWindow = true;
        bedroom.roomSquare = 13;


        System.out.println("Number of Flat is " + flat.flatNumber);
        System.out.println("My bedroom's square is " + bedroom.roomSquare);


    }
}
