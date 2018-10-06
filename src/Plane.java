public class Plane extends Vehicle {
    int height;
    int numberOfPassegens;


    public Plane(int coordinateX, int coordinateY, int coast, int speed, int yearOfMonufacture, int height, int numberOfPassegens) {
        super(coordinateX, coordinateY, coast, speed, yearOfMonufacture);
        this.height = height;
        this.numberOfPassegens = numberOfPassegens;
    }

    @Override
    public String toString() {
        return
                "Plane " + "height = " + height +
                ", numberOfPassegens = " + numberOfPassegens +
                ", coordinateX = " + coordinateX +
                ", coordinateY = " + coordinateY +
                ", coast = " + coast +
                ", speed = " + speed +
                ", yearOfMonufacture = " + yearOfMonufacture;
    }
}
