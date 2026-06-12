/**
 * Clase de utilidad que contiene distintos métodos estáticos
 * para trabajar con arrays de enteros.
 * Incluye métodos para imprimir, copiar, ordenar, comparar
 * y modificar arrays.
 *
 * @author Manuel
 */
public class ArrayOperations {

    /**
     * Imprime un array de enteros con formato [a, b, c].
     *
     * @param array array de enteros a imprimir
     */
    public static void print(int[] array){
        System.out.print("PRINT: [");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i < array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    /**
     * Revierte el contenido de un array de enteros.
     * El primer elemento pasa a ser el último y viceversa.
     *
     * @param array array de enteros a revertir
     */
    public static void revertirArray(int[] array){

        int temp;

        for (int i = 0; i < array.length / 2; i++){
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    /**
     * Devuelve el valor máximo de un array.
     *
     * @param array array de enteros
     * @return valor máximo del array
     */
    public static int max(int[] array){

        int max = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Devuelve el valor mínimo de un array.
     *
     * @param array array de enteros
     * @return valor mínimo del array
     */
    public static int min(int[] array){

        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Calcula la suma de todos los elementos de un array.
     *
     * @param array array de enteros
     * @return suma total de los valores del array
     */
    public static int sum(int[] array){

        int suma = 0;

        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return suma;
    }

    /**
     * Comprueba si dos arrays son iguales en contenido y orden.
     *
     * @param a primer array
     * @param b segundo array
     * @return true si son iguales, false en caso contrario
     */
    public static boolean equals(int[] a, int[] b){

        if (a == null || b == null || a.length != b.length){
            return false;
        }

        for (int i = 0; i < a.length; i++){
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * Comprueba si dos arrays contienen los mismos elementos,
     * sin importar el orden.
     *
     * @param a primer array
     * @param b segundo array
     * @return true si contienen los mismos elementos
     */
    public static boolean equalsWithoutOrder(int[] a, int[] b){

        if (a.length != b.length){
            return false;
        }

        boolean[] usados = new boolean[b.length];

        for (int i = 0; i < a.length; i++){
            boolean encontrado = false;

            for (int j = 0; j < b.length; j++){
                if (a[i] == b[j] && !usados[j]){
                    usados[j] = true;
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado){
                return false;
            }
        }
        return true;
    }

    /**
     * Ordena un array de enteros de menor a mayor.
     *
     * @param array array de enteros a ordenar
     */
    public static void sort(int[] array){

        int temp;

        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * Copia los valores de un array origen a un array destino.
     *
     * @param src array origen
     * @param dst array destino
     */
    public static void copy(int[] src, int[] dst){

        int length = Math.min(src.length, dst.length);

        for (int i = 0; i < length; i++){
            dst[i] = src[i];
        }
    }

    /**
     * Sustituye los números impares del array por 0.
     *
     * @param array array de enteros
     */
    public static void removeOddNumbers(int[] array){

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                array[i] = 0;
            }
        }
    }

    /**
     * Imprime un tramo del array entre dos posiciones.
     *
     * @param array array de enteros
     * @param start posición inicial
     * @param end posición final
     */
    public static void printRange(int[] array, int start, int end){

        System.out.print("[");
        for (int i = start; i <= end; i++){
            System.out.print(array[i]);
            if (i < end){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    /**
     * Elimina los números de un solo dígito de un array
     * y devuelve un nuevo array con el resto.
     *
     * @param array array de enteros
     * @return nuevo array sin números de un dígito
     */
    public static int[] deleteOneDigitNumbers(int[] array){

        int contador = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] >= 10 || array[i] <= -10){
                contador++;
            }
        }

        int[] nuevo = new int[contador];
        int j = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] >= 10 || array[i] <= -10){
                nuevo[j++] = array[i];
            }
        }

        return nuevo;
    }

    /**
     * Cuenta cuántos números positivos hay en un array.
     *
     * @param array array de enteros
     * @return número de valores positivos
     */
    public static int countPositiveNumbers(int[] array){

        int contador = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > 0){
                contador++;
            }
        }
        return contador;
    }
}
