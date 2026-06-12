import java.util.Scanner;

public class ej7 {
    public static void run(Scanner sc){

        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        do {
            System.out.println(num);
            num--;
        }while (num>0);

    }
}
