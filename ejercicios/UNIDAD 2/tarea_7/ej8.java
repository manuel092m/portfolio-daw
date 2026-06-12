import java.util.Scanner;

public class ej8 {
    public static void run(Scanner sc) {

        int contador = 0;
        int numero = 2;

        while (contador < 50) {
            boolean esPrimo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }
}

