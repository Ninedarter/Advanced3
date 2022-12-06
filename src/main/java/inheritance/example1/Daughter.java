package inheritance.example1;

public class Daughter extends Father{

    boolean isGoodWithDancing;

    public Daughter(String lastName, String eyeColor, boolean isGoodWithDancing) {
        super(lastName, eyeColor);
        this.isGoodWithDancing = isGoodWithDancing;
    }

    public Daughter(boolean isGoodWithDancing) {
        this.isGoodWithDancing = isGoodWithDancing;
    }

    public Daughter(String lastName, String eyeColor) {
        super(lastName, eyeColor);
    }

    public void dance(){
        System.out.println("Dancing");
    }


    @Override
    public String toString() {
        return "Daughter{" +
                "isGoodWithDancing=" + isGoodWithDancing +
                ", LastName='" + LastName + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
