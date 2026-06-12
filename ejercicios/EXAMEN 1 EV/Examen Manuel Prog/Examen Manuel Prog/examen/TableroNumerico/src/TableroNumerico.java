import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TableroNumerico {
    public static void main(String[] args) {

        int filas;
        int columnas;
        do {
            Scanner fl = new Scanner(System.in);
            System.out.println("Introduce el numero de filas");
            filas = fl.nextInt();

            Scanner cl = new Scanner(System.in);
            System.out.println("Introduce el numero de columnas");
            columnas = cl.nextInt();


        } while (filas < 0 && columnas > 0);

        for (int x = 0 ; x<=filas ;x++) {
            for (int y= 0; y <= columnas; y++) {
                int producto = x * y;


                if (producto %5 ==0) {
                    System.out.print("*");
                    System.out.println();
                }
                else{
                    System.out.print(producto);
                    System.out.println();

                }


            }
        }

    }
}