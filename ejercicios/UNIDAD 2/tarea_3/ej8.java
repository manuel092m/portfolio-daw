import java.util.Scanner;

public class ej8 {
    public static void run(Scanner sc) {

        int num = 1;

        while (num<=25){

            if (num < 25) {
                System.out.print(num+ ", ");
            } else {
                System.out.print(num);
            }
            num = num +4;

        }


    }
}

