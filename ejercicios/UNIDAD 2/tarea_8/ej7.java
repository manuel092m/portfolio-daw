import java.util.Scanner;

public class ej7 {
    public static void run(Scanner sc) {


                for (int k = 0; k < 5; k++) {
                    try {
                        System.out.println("Resultado: " + (100 / k));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: no se puede dividir entre cero (k = " + k + ")");
                        e.printStackTrace();
                    }
                }

                System.out.println("Programa finalizado correctamente.");
            }
        }