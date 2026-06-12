import java.util.Scanner;

public class UsuarioCubo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Cubo[] cubos = new Cubo[3];

        for (int i = 1; i <= 3; i++) {

            System.out.print("Introduce el lado del cubo " + i + ": ");
            int lado = sc.nextInt();

            Cubo c = new Cubo(lado);

            System.out.println(c.area());
            System.out.println(c.volumen());
        }

        sc.close();
    }
}
