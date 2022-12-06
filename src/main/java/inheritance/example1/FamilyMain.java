package inheritance.example1;

public class FamilyMain {
    public static void main(String[] args) {

        Father fatherJohn = new Father("Russel","Red");
        System.out.println(fatherJohn);
        fatherJohn.singBeautiful();

        Son sonBill = new Son("Russel", "Red", true);
        sonBill.singBeautiful();
        System.out.println(sonBill.isGoodWithComputers); // son specific laukas, tetis jo nemato
        System.out.println(sonBill.eyeColor); // son specific laukas, tetis jo nemato
        System.out.println(sonBill);

        Daughter daughter = new Daughter("Jones","Blue");

        System.out.println(daughter);
        System.out.println();
        System.out.println();
        Daughter daughter2 = new Daughter(true);

        System.out.println(daughter2);


    }
}
