import java.util.Scanner;

public class ej7 {
    public static void run(Scanner sc){

        String clase = "Clase7:";
        int numOrdenador = 1;

        while (numOrdenador <=24){

            System.out.print(clase + numOrdenador+", ");
            numOrdenador = numOrdenador +1;
            if (numOrdenador < 24) {
                System.out.print(clase + numOrdenador + ", ");
            } else {
                System.out.print(clase + numOrdenador);
            }
            numOrdenador = numOrdenador + 1;
        }

        System.out.println("\nFIN");
        }




    }

