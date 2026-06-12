import java.util.Scanner;

public class ej5 {
    public static void run(Scanner sc) {

        //a.
        System.out.println("a)");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //b
        System.out.println("b)");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println();

        //c
        System.out.println("c)");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        //d
        System.out.println("d)");
        for (int i = 1; i <= 5; i++) {
            for (int e = 5; e > i; e--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}













