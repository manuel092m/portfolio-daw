import java.util.Scanner;

public class ej4 {
    public static void run(Scanner sc) {

        System.out.println("Introduce la altura");
        int alt = sc.nextInt();

        Scanner cs = new Scanner(System.in);
        System.out.println("Introduce la anchura");
        int anc = sc.nextInt();

        for (int i = 1 ; i<=alt ; i++){
            for (int j = 1 ; j<=anc ; j++){
                System.out.print("#");
            }
            System.out.println();
        }


            }
        }













