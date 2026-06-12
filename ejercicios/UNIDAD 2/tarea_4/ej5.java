import java.util.Scanner;

public class ej5 {
    public static void run(Scanner sc){

        int contador = 1;
        do {
            System.out.println(contador);
            if (contador % 4 == 0) {
                System.out.println("Múltiplo de 4 encontrado. Salir");
                contador = 10;
            }
            contador++;
        } while (contador <= 10);



    }
}
