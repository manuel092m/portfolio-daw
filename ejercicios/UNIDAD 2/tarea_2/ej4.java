import java.util.Scanner;

public class ej4 {

    public static void run(Scanner sc) {

        final int VAINILLA = 0;
        final int CHOCOLATE = 1;
        final int FRESA = 2;


        System.out.println("Elige un sabor de helado:");
        System.out.println(VAINILLA + " - Vainilla");
        System.out.println(CHOCOLATE + " - Chocolate");
        System.out.println(FRESA + " - Fresa");
        System.out.print("Introduce el número del sabor: ");

        int sabor = sc.nextInt();

        switch (sabor) {
            case VAINILLA:
                System.out.println("Has elegido Vainilla ");
                break;
            case CHOCOLATE:
                System.out.println("Has elegido Chocolate");
                break;
            case FRESA:
                System.out.println("Has elegido Fresa");
                break;
            default:
                System.out.println("Error");
                break;
        }

    }
}
