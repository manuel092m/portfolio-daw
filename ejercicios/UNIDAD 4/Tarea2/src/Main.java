import java.util.Scanner;

public class Main {
    public static int[] ordenarArray(int[] array) {

        int[] ordenado = new int[array.length];


        for (int i = 0; i < array.length; i++) {
            ordenado[i] = array[i];
        }


        for (int i = 0; i < ordenado.length - 1; i++) {
            for (int j = 0; j < ordenado.length - 1; j++) {
                if (ordenado[j] > ordenado[j + 1]) {
                    int aux = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = aux;
                }
            }
        }

        return ordenado;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres introducir? ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int[] ordenado = ordenarArray(array);

        System.out.println("Array ordenado:");
        for (int num : ordenado) {
            System.out.print(num + " ");
        }
    }


}

