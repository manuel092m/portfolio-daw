import java.util.Scanner;

public class ej7 {
    public static void run(Scanner sc) {


        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                if (j % 2 == 1) System.out.print("*");

                else System.out.print("0");

                if (j < i){
                    System.out.print(" ");
                }
            }
                    System.out.println();
                }
    }
}

