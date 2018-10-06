public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(256,456,
                20000000,300
                ,2000,1500,
                65);
        Car car = new Car(232, 433,50000,200,1998);
        Ship ship = new Ship(565,344,
                10000000,45,
                2005,700,"Singapur");

        System.out.println(plane.toString() + "\n" + car.toString() + "\n" + ship.toString());
    }
}
