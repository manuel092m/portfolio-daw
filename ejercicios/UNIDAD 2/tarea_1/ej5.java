import java.util.Scanner;

public class ej5 {
    public static void run(Scanner sc){

        System.out.println("Introduce valores para A, B Y C, en ese orden");
        Scanner pab = new Scanner(System.in);

        Scanner pac = new Scanner(System.in);

        int a = sc.nextInt();
        int b = pab.nextInt();
        int c = pac.nextInt();

        if (a>b && a>c){
            System.out.println("A es el mayor");
        } else if (b>a && b>c) {
            System.out.println("B es el mayor");
        }else if (c>a && c>b){
            System.out.println("C es el mayor");
        }else System.out.println("SON IGUALES O INCORRECTOS");
    }
}
