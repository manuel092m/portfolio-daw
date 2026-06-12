import java.util.Scanner;

public class fibonacci {
    public static void run(Scanner sc){

        System.out.print("Primer número: ");
        int a = sc.nextInt();

        System.out.print("Segundo número: ");
        int b = sc.nextInt();

        System.out.print("Límite de números: ");
        int limite = sc.nextInt();

        int contador = 2; // ya tenemos los dos primeros

        System.out.print(a + " " + b + " ");

        while (contador < limite) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            contador++;
        }
    }
}
