import java.util.Scanner;

public class ArrayTester {


    public static int[] leerEnteros() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos numeros vas a introducir? ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        return array;
    }


    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


    public static int[] transformarArray(int[] original) {
        int[] nuevo = new int[original.length];


        for (int i = 0; i < original.length; i++) {
            nuevo[i] = original[i];
        }


        for (int i = 0; i < nuevo.length; i++) {
            if (nuevo[i] % 2 != 0) { // impar
                nuevo[i] = -1;
            }
        }

        return nuevo;
    }

    public static void main(String[] args) {
        int[] arrayOriginal = leerEnteros();

        System.out.print("Array original: ");
        imprimirArray(arrayOriginal);

        int[] arrayTransformado = transformarArray(arrayOriginal);

        System.out.print("Array transformado: ");
        imprimirArray(arrayTransformado);
    }
}
