public class Main {
    public static void main(String[] args) {

        int[] array = {-2, 45, -29, 77, 56, 31};
        int[] copyArray = new int[array.length];
        int[] arrayOrdenado = new int[array.length];

        System.out.println(ArrayOperations.max(array));

        ArrayOperations.copy(array, copyArray);
        System.out.println();
        ArrayOperations.print(copyArray);
        System.out.println();

        ArrayOperations.copy(array, arrayOrdenado);
        System.out.println();
        ArrayOperations.sort(arrayOrdenado);
        System.out.println();

        System.out.println(ArrayOperations.equalsWithoutOrder(array, arrayOrdenado));
        System.out.println(ArrayOperations.equals(array, copyArray));

        ArrayOperations.removeOddNumbers(array);
        System.out.println();

        System.out.println(ArrayOperations.sum(array));
        System.out.println(ArrayOperations.min(array));

        ArrayOperations.printRange(array, 0, 3);
        System.out.println();

        ArrayOperations.revertirArray(arrayOrdenado);
        System.out.println();

        ArrayOperations.printRange(arrayOrdenado, 1, 4);
    }
}



