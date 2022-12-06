package inheritance.example1;

public class Father {
    String LastName = "Johnson";
    String eyeColor = "Green";

    public Father(String lastName, String eyeColor) {
        LastName = lastName;
        this.eyeColor = eyeColor;
    }

    public Father() {
    }

    void singBeautiful(){
        System.out.println("Singing very very nice");
    }

    @Override
    public String toString() {
        return "Father{" +
                "LastName='" + LastName + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
