import java.util.Scanner;

public class ej6 {
    public static void run(Scanner sc) {

        System.out.println("Introduce el valor de incremento:");
        int incremento = sc.nextInt();

        for (int contador = 0; contador <= 100; contador = contador + incremento) {
            System.out.println(contador);
        }

    }
}