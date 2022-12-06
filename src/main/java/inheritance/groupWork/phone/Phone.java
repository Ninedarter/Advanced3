package inheritance.groupWork.phone;

public class Phone extends Device {

    String phoneModel;

    public Phone(String name, int price, String color, String phoneModel) {
        super(name, price, color);
        this.phoneModel = phoneModel;
    }

    void callMobile(String  number){
        System.out.println("Calling number " + number );
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneModel='" + phoneModel + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
