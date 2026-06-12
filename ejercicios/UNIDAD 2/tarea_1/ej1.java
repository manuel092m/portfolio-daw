import java.util.Scanner;

public class ej1 {

    public static void run(Scanner sc) {
        System.out.println("¿Eres el propietario de la máquina? (true/false)");
        boolean isOwner = sc.nextBoolean();

        if (isOwner) {
            System.out.println("Hola, bienvenido al sistema.");
        } else {
            System.out.println("Error");
        }
    }
}
