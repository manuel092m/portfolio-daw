import java.util.InputMismatchException;
import java.util.Scanner;

public class ej8 {
    public static void run(Scanner sc) {


                int opcion = 0;
                boolean valida = false;

                do {
                    System.out.println("\n=== MENÚ ===");
                    System.out.println("1. CORRER");
                    System.out.println("2. ANDAR");
                    System.out.println("3. COCHE");
                    System.out.println("4. AVIÓN");
                    System.out.print("Elige una opción: ");

                    try {
                        opcion = sc.nextInt();

                        if (opcion >= 1 && opcion <= 4) {
                            System.out.println("Opción válida");
                            valida = true;
                        } else {
                            System.out.println("Opción no válida, elige entre 1 y 4");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Solo se permiten números");
                        sc.nextLine();
                    }

                } while (!valida);

                sc.close();
            }
        }






