import java.util.Scanner;

public class ej1 {

    public static void run(Scanner sc) {
        System.out.println("Que edad tienes");
        int edad = sc.nextInt();

        Scanner cred= new Scanner(System.in);
        System.out.println("Cual es su credito disponible?");
        double credito = cred.nextDouble();

        if (edad >=21 && credito>=10000){
            System.out.println("APTO");
        }else
            System.out.println("NO APTO");

        /*en el caso de ser un ||, habilita como apto el caso de 21 años y 9.000€
        y a partir de ahora con que se cumpla una sola condicion ya sería apto*/
    }
}
