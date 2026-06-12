import java.util.Scanner;

public class ej6 {
    public static void run(Scanner sc){

        System.out.println("Introduce un numero");
        int tabla = sc.nextInt();
        int multiplicador = 1;

        System.out.println("Tabla de multiplicar del " + tabla + ":");

        do {
            System.out.println(tabla + " x " + multiplicador + " = " + (tabla * multiplicador));
            multiplicador++;
        }while (multiplicador<=10);

    }
}
