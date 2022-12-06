package GroupWork;

public class Car extends LandTransport{

    private String model;

    public Car(double speed, int wheelCount, String model) {
        super(speed, wheelCount);
        this.model = model;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void checkTirePressure() {
        System.out.println("Car tire pressure is good");
    }

    public void beep (){
        System.out.println("Car is beeping");
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "model='" + model + '\'' +
//                ", wheelCount=" + wheelCount +
//                ", speed=" + getSpeed() +
//                '}';
//    }
}