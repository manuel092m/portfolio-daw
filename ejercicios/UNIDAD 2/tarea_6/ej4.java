import java.util.Scanner;

public class ej4 {
    public static void run(Scanner sc) {

        int count, suma;
        suma = 0;
        count = 0;

        for (count = 0; count <= 5; count++) {

            suma = suma +count;
            System.out.println(count);

        }

        System.out.println("la suma es "+ suma);

    }
}