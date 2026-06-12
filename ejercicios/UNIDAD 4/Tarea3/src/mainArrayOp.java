public class mainArrayOp {

    public static void main(String[] args){

        int[] a={1, 2, 3, 4};
        int[] b={2, 6, 4, 8};
        int[] c={2, 4, 6, 8};
        int[] origen = {6, 2, 3, 3};
        int[] destino = new int[4];
        int[] largo = {6, 2, 3, 3, 8, 3, 5};
        int[] delete = {12, 421, 2, -1};


        System.out.print("ORIGEN: ");
        ArrayOperations.print(origen);
        ArrayOperations.revertirArray(a);
        System.out.println();
        ArrayOperations.print(a);
        System.out.println();
        System.out.println(ArrayOperations.max(a));
        System.out.println(ArrayOperations.min(a));
        System.out.println(ArrayOperations.sum(a));
        System.out.println(ArrayOperations.equals(b,c));
        System.out.println(ArrayOperations.equalsWithoutOrder(b,c));
        ArrayOperations.sort(b);
        System.out.println();
        ArrayOperations.copy(origen, destino);
        System.out.println();
        ArrayOperations.removeOddNumbers(origen);
        System.out.println();
        ArrayOperations.printRange(largo, 3, 6);
        ArrayOperations.deleteOneDigitNumbers(delete);

    }
}
