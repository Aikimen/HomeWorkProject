package homework4.Methods.CarAccelerate;

public class Car {
    private int currentSpeed = 0;
    String model;
    String brand;

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void speedUp (int speedIn) {
       this.currentSpeed = this.currentSpeed + speedIn;
    }

    public void brake() {
        if(this.currentSpeed <= 10){
            this.currentSpeed = 0;
        } else {
          this.currentSpeed = this.currentSpeed - 10;
        }
    }
}
