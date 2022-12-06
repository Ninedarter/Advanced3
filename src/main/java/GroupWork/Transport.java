package GroupWork;

public class Transport {

    private double speed;

    public Transport(double speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("Transport is moving");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "speed=" + speed +
                '}';
    }
}