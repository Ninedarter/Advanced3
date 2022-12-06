package inheritance.groupWork.phone;

public class Tv  extends  Device{

    boolean isLargerThenPhone;

    public Tv(String name, int price, String color, boolean isLargerThenPhone) {
        super(name, price, color);
        this.isLargerThenPhone = isLargerThenPhone;
    }

    void switchChannel(String channelToSwtich){
        System.out.println("Channel switched to " + channelToSwtich);
    }

    @Override
    void work() {
        System.out.println("Tv is working ");
    }
}
