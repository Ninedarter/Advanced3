package inheritance.groupWork.phone;

public class Car extends Device{    boolean isBroken;

    public Car(String name, int price, String color, boolean isBroken) {
        super(name, price, color);
        this.isBroken = isBroken;
    }
}
