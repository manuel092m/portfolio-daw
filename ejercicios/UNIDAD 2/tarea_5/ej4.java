import java.util.Scanner;

public class ej4 {
    public static void run(Scanner sc){

        int num;
        int suma = 0;
        int contador = 0;
        int impares = 0;

        System.out.println("Introduce un número objetivo:");
        int objetivo = sc.nextInt();
        int contadorObjetivo = 0;

        do {
            System.out.println("Inserta un número (0 para salir):");
            num = sc.nextInt();

            if (num != 0) {
                suma += num;
                contador++;
            }

            if (num % 2 != 0 && num != 0){
                impares++;
            }

            if (num == objetivo) {
                contadorObjetivo++;
            }

        } while (num != 0);

        System.out.println("La suma de los valores es " + suma);
        System.out.println("Total de números insertados: " + contador);
        System.out.println("Total de números impares: " + impares);
        System.out.println("El valor " + objetivo + " se insertó " + contadorObjetivo + " veces");
    }
}
