import java.util.Scanner;

public class ej3 {

    public static void run(Scanner sc) {

        int vainilla = 0;
        int chocolate = 1;
        int fresa= 2;

        System.out.println("Elige un sabor de helado 0-Vainilla 1-Chocolate 2-Fresa");
        int sabor = sc.nextInt();
        switch (sabor){
            case 0:
                System.out.println("Has elegido Vainilla");
                break;

            case 1:
                System.out.println("Has elegido Chocolate");
                break;

            case 2:
                System.out.println("Has elegido Fresa");
                break;

            default:
                System.out.println("ERROR");
        }

    }
}
