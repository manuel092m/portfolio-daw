import java.util.Scanner;

public class ej2 {
    public static void run(Scanner sc){

        int num;
        int suma = 0;
        int contador = 0;

        do {
            System.out.println("Inserta un número (0 para salir):");
            num = sc.nextInt();

            if (num != 0) {
                suma = num + suma;
                contador++;
            }

        } while (num != 0);

        System.out.println("La suma de los valores es " + suma);
        System.out.println("Total de números insertados  " + contador);
    }

    }

