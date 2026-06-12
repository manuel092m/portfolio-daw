import java.util.Scanner;

public class ej1 {
    public static void run(Scanner sc) {

        double celsius;
        double fahrenheit;

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce la temperatura en Fahrenheit: ");
        fahrenheit = in.nextDouble();

        celsius = (5.0 / 9.0) * (fahrenheit - 32);

        System.out.println(fahrenheit + " \u00B0F = " + celsius + " \u00B0C");
    }
}