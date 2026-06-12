import java.util.Scanner;

public class descomposicion_dinero {
    public static void run(Scanner sc) {


        System.out.print("Introduce una cantidad: ");
        int cantidad = sc.nextInt();

        int b500 = 0;
        int b200 = 0;
        int b100 = 0;
        int b50 = 0;
        int b20 = 0;
        int b10 = 0;
        int b5 = 0;
        int m2 = 0;
        int m1 = 0;

        for (; cantidad >= 500; cantidad = cantidad - 500) {
            b500 = b500 + 1;
        }

        for (; cantidad >= 200; cantidad = cantidad - 200) {
            b200 = b200 + 1;
        }

        for (; cantidad >= 100; cantidad = cantidad - 100) {
            b100 = b100 + 1;
        }

        for (; cantidad >= 50; cantidad = cantidad - 50) {
            b50 = b50 + 1;
        }

        for (; cantidad >= 20; cantidad = cantidad - 20) {
            b20 = b20 + 1;
        }

        for (; cantidad >= 10; cantidad = cantidad - 10) {
            b10 = b10 + 1;
        }

        for (; cantidad >= 5; cantidad = cantidad - 5) {
            b5 = b5 + 1;
        }

        for (; cantidad >= 2; cantidad = cantidad - 2) {
            m2 = m2 + 1;
        }

        for (; cantidad >= 1; cantidad = cantidad - 1) {
            m1 = m1 + 1;
        }

        System.out.println();
        System.out.println("Descomposición del dinero:");
        System.out.println("---------------------------");
        System.out.println(b500 + " billete(s) de 500");
        System.out.println(b200 + " billete(s) de 200");
        System.out.println(b100 + " billete(s) de 100");
        System.out.println(b50 + " billete(s) de 50");
        System.out.println(b20 + " billete(s) de 20");
        System.out.println(b10 + " billete(s) de 10");
        System.out.println(b5 + " billete(s) de 5");
        System.out.println(m2 + " moneda(s) de 2");
        System.out.println(m1 + " moneda(s) de 1");
    }
}