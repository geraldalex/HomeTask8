public class Ship extends Vehicle {
    int numberOfPassegens;
    String port;

    public Ship(int coordinateX, int coordinateY, int coast, int speed, int yearOfMonufacture, int numberOfPassegens, String port) {
        super(coordinateX, coordinateY, coast, speed, yearOfMonufacture);
        this.numberOfPassegens = numberOfPassegens;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Ship " +
                "numberOfPassegens = " + numberOfPassegens +
                ", port = '" + port + '\'' +
                ", coordinateX = " + coordinateX +
                ", coordinateY = " + coordinateY +
                ", coast = " + coast +
                ", speed = " + speed +
                ", yearOfMonufacture = " + yearOfMonufacture
                ;
    }
}
