package inheritance.groupWork.phone;

public class Device {
    String name;
    int price;
    String color;


    void turnOn(){
        System.out.println("Tv  is on ");
    }

    void work(){
        System.out.println("Working");
    }

    public Device(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }
}
