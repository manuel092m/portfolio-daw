import java.util.Scanner;

public class ej3 {
    public static void run(Scanner sc){


        System.out.println("Indtrouce un numero:\n");
        int num = sc.nextInt();

        if (num >=0){
            System.out.println("El numero "+ num + " es positivo, " +
                    "siendo "+num+" el numero introducido por teclado");
            System.out.println("Todos los números positivos son mayores a cero.");
        }else if (num <0) {
            System.out.println("Es negativo");

        }else System.out.println("ERROR");
    }
}
