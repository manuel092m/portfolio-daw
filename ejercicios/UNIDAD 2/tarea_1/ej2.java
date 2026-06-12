import java.util.Scanner;

public class ej2 {

    public static void run(Scanner sc){
        int age = 0;
        System.out.println("Introduce tu edad:");
        age = sc.nextInt();

        if (age<=12) {
            System.out.println("Se le aplicará la tarifa de niño.");
        } else {
            System.out.println("Se le aplicará la tarifa de adulto.");
        }

        System.out.println("Disfruta la película.");
    }
}
