import java.util.Scanner;

public class ej6 {
    public static void run(Scanner sc) {

        System.out.print("+ ");
        for (int i = 0; i < 5; i++) {
            System.out.print("<> ");
        }
        System.out.println("+");


        for (int i = 0; i < 1; i++) {
            System.out.print("|");

            for (int j = 0; j < 5 * 3 + 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }


        System.out.print("+ ");
        for (int i = 0; i < 5; i++) {
            System.out.print("<> ");
        }
        System.out.println("+");
    }
}