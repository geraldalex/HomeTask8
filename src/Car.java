public class Car extends Vehicle {

    public Car(int coordinateX, int coordinateY, int coast, int speed, int yearOfMonufacture) {
        super(coordinateX, coordinateY, coast, speed, yearOfMonufacture);
    }

    @Override
    public String toString() {
        return "Car " +
                "coordinateX = " + coordinateX +
                ", coordinateY = " + coordinateY +
                ", coast = " + coast +
                ", speed = " + speed +
                ", yearOfMonufacture = " + yearOfMonufacture;
    }
}
