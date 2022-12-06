package inheritance.example1;

/**
 * Extends zodelis nurodo is kurios klases metodus ir laukus noriu paveldeti
 */

public class Son extends Father{

    boolean isGoodWithComputers;

    public Son(String lastName, String eyeColor, boolean isGoodWithComputers) {
        super(lastName, eyeColor);
        this.isGoodWithComputers = isGoodWithComputers;
    }

    @Override // reiskia,kad uzrasysiu ant virsaus tevines klases funkcionaluma
    void singBeautiful() {
        System.out.println("Son is singing way more beautiful");
    }

    @Override
    public String toString() {
        return "Son{" +
                "isGoodWithComputers=" + isGoodWithComputers +
                ", LastName='" + LastName + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
