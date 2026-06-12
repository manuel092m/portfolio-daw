import java.util.Scanner;

public class ej2 {
    public static void run(Scanner sc) {


        //a.
        for (int k = 0; k < 100; k++)
            System.out.println(k);

        //b.
        for (int k = 1; k <= 100; k = k + 2)
            System.out.println(k);

        //d.
        for (int k = 0; k < 100; k++)
            System.out.print(k + " ");

        //f.
        for (int k = 1; k < 100; k+=2)
            System.out.print(k + " ");

        //g.
        for (int k = 1; k != 10; k++)
            System.out.print(k + " ");
    }


}