import java.util.Scanner;

public class ej2 {
    public static void run(Scanner sc){
        System.out.println("elige un valor inicial del contador");
        int valor = sc.nextInt();

        Scanner lim = new Scanner(System.in);
        System.out.println("elige el valor límite");
        int limite = lim.nextInt();

        while (valor <= limite) {
            System.out.println("contador es: " + valor);
            valor = valor + 1;
        }

        System.out.println("Termina el bucle");

    }
}
