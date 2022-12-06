package GroupWork;

public class TransportMain {

    public static void main(String[] args) {
        Transport transport = new Transport(95);
        transport.move();
        LandTransport landTransport = new LandTransport(95, 4);
        landTransport.checkTirePressure();
        landTransport.move();
        Car car = new Car(95, 4, "Audi");
        car.move();
        car.beep();
        System.out.println(car);
    }
}