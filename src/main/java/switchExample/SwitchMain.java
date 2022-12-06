package switchExample;

import java.util.Scanner;

public class SwitchMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu nuo 1 iki 3");
        int ivestasSkaicius = scanner.nextInt();

        switch (ivestasSkaicius) {
            case 1:
                System.out.println("Ivedete 1  ");
                break;
            case 2:
                System.out.println("Ivedete 2 ");
                break;
            case 3:
                System.out.println("Ivedete 3 ");
                break;
            default :
                System.out.println("Ivestas blogas skaicius");
                break;
        }

    }
}
