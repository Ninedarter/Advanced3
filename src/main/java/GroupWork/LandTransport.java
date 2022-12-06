package GroupWork;

public class LandTransport extends Transport{

    protected int wheelCount;

    public LandTransport(double speed, int wheelCount) {
        super(speed);
        this.wheelCount = wheelCount;
    }

    public void checkTirePressure(){
        System.out.println("Tire pressure is ok");
    }

    @Override
    public void move() {
        System.out.println("Land transport is moving");
    }

    @Override
    public String toString() {
        return "LandTransport{" +
                "wheelCount=" + wheelCount +
                '}';
    }
}