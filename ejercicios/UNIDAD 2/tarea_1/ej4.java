import java.util.Scanner;

public class ej4 {
    public static void run(Scanner sc){

        System.out.println("Indtrouce un numero:\n");
        double precio = sc.nextDouble();

        double impuestos = 0.05;
        double precioConImpuestos= (precio*impuestos);
        double total = precio + precioConImpuestos;

        if (precio >=300){
            System.out.println("El precio es " + total + " €, siendo " + precio + " € de base más " + precioConImpuestos + " € de impuestos.");
        }else if (precio <300){
            System.out.println("El precio esta libre de impuestos y es "+ precio);
        }else System.out.println("ERROR");

    }
}
