import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MenuOperaciones {
    public static void main(String[] args) {
        //Saludo
        String nombre = "Manuel De Los Reyes";
        System.out.println("Hola " + nombre);
        System.out.println();

        //Bucle para mostrar el mensaje
        int opcion = 0;
        do {
            System.out.println("=== MENÚ DE OPERACIONES ===");
            System.out.println("1. Calcular área de un círculo");
            System.out.println("2. Convertir grados Celsius a Fahrenheit");
            System.out.println("3. Mostrar tabla de multiplicar");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce una opción:");
            opcion = sc.nextInt();

            //Switch para definir cada resultado depende el caso que sea
            switch(opcion){

                //Calcular área de un círculo
                case 1:
                    Scanner rd = new Scanner(System.in);
                    System.out.print("Define el radio: ");
                    double radio = rd.nextDouble();
                    if (radio <0){
                        rd = new Scanner(System.in);
                        System.out.print("Pon un valor valido: ");
                        radio = rd.nextDouble();
                    }

                    double pi = 3.14;
                    double area = pi * radio;
                    System.out.println("El area es "+ area);
                    return;
                //Convertir grados Celsius a Fahrenheit
                case 2:
                    Scanner gd = new Scanner(System.in);
                    System.out.print("Define los grados Celsius: ");
                    double grados = gd.nextDouble();

                    if (grados <0){
                        gd = new Scanner(System.in);
                        System.out.print("Pon un valor valido: ");
                        grados = gd.nextDouble();
                    }

                    double F = grados *1.8 +32;
                    System.out.println(grados+ " grados Celsius son " + F + " Fahrenheit");
                    return;
                //Mostrar tabla de multiplicar
                case 3:
                    Scanner ns = new Scanner(System.in);
                    System.out.print("Tabla de que numero quieres ver: ");
                    int tabla = ns.nextInt();

                    if (tabla <0){
                        ns = new Scanner(System.in);
                        System.out.print("Pon un valor valido");
                        tabla = ns.nextInt();
                    }

                    for (int i = 1 ; i<10 ; i++){
                        int resultado = tabla *i;
                        System.out.println(i +"*" +tabla+ " = " +resultado);
                    }
                    return;
                //Mostrar error si no es alguno de estos casos
                default:
                    System.out.println("error");
            }

        }while (opcion !=0);









    }
}